/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domain.Autor;
import domain.Knjiga;
import domain.User;
import domain.Zanr;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DBBroker {

    public List<Knjiga> ucitajListuKnjiga() {
        List<Knjiga> lista=new ArrayList<>();
        
        try {
            String upit="SELECT * FROM Knjiga K JOIN AUTOR A ON K.autorid=a.id";
            Statement st=Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("k.id");
                String naslov=rs.getString("k.naslov");
                String ISBN=rs.getString("k.ISBN");
                int godinaizdanja=rs.getInt("k.godinaizdanja");
                String zanr=rs.getString("k.zanr");
                Zanr z=Zanr.valueOf(zanr);
                int ida=rs.getInt("a.id");
                String ime=rs.getString("a.ime");
                String prezime=rs.getString("a.prezime");
                int godina=rs.getInt("a.godina");
                String biografija=rs.getString("a.biografija");
                
                Autor a=new Autor(ida,ime,prezime,godina,biografija);
                Knjiga k=new Knjiga(id,naslov,a,ISBN,godinaizdanja,z);
                lista.add(k);
            }
        } catch (SQLException ex) {
            System.out.println("Greska2!");
        }
        return lista;
    }    

    public List<Autor> ucitajListuAutora() {
        List <Autor> al=new ArrayList<>();
        
        try {
            String upit="SELECT * FROM Autor";
            Statement st=Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int ida=rs.getInt("id");
                String ime=rs.getString("ime");
                String prezime=rs.getString("prezime");
                int godina=rs.getInt("godina");
                String biografija=rs.getString("biografija");
                
                Autor a=new Autor(ida,ime,prezime,godina,biografija);
                al.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("Greska");
        }
        
        return al;
    }

    public void obrisiKnjiguIzBaze(int id) {
        
        try {
            String upit="Delete FROM KNJIGA WHERE ID=?";
            PreparedStatement ps=Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, id);
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            System.out.println("greskaobrisi");
        }
    }

    public void dodajKnjiguUBazu(Knjiga novaKnjiga) {
        PreparedStatement ps;
        try {
            String upit="INSERT INTO KNJIGA(id, naslov, autorid, ISBN, godinaizdanja, zanr) VALUES (?,?,?,?,?,?)";
            ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, novaKnjiga.getId());
            ps.setString(2, novaKnjiga.getNaslov());
            ps.setInt(3, novaKnjiga.getAutor().getId());
            ps.setString(4, novaKnjiga.getISBN());
            ps.setInt(5, novaKnjiga.getGodinaIzdanja());
            ps.setString(6, novaKnjiga.getZanr().toString());
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        try {
            String upit="UPDATE KNJIGA SET naslov=?, autorid=?, godinaizdanja=?, zanr=? where id=?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(5, knjigaZaIzmenu.getId());
            ps.setString(1, knjigaZaIzmenu.getNaslov());
            ps.setInt(2, knjigaZaIzmenu.getAutor().getId());
            ps.setInt(3, knjigaZaIzmenu.getGodinaIzdanja());
            ps.setString(4, knjigaZaIzmenu.getZanr().toString());
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            System.out.println("ajde");
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean login2(String ime, String password) {
        List<User> u=new ArrayList<>();
        try {
            String upit="SELECT * FROM USER";
            Statement st=Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String ime1=rs.getString("username");
                String sifra=rs.getString("password");
                User user=new User(id, ime1, sifra);
                u.add(user);
            }
            for (User user : u) {
                if(user.getIme().equalsIgnoreCase(ime)&&user.getSifra().equals(password))
                {
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Greska");
        }
        return false;
    }

    public List<Knjiga> filtriraj(String autor, String naslov) {
        List<Knjiga> k=new ArrayList<>();
        try {
        String upit="SELECT * FROM KNJIGA K JOIN AUTOR A ON K.AUTORID=A.ID WHERE 1=1";
        if(naslov!=null)
        {
            upit+=" AND K.naslov='"+naslov+"'";
        }
        if(autor!=null)
        {
            String[] podaci=new String[2];
            podaci=autor.split(" ");
            if(podaci[0]!=null)
            {
                upit+=" AND a.ime='"+podaci[0]+"'";
            }
            if(podaci[1]!=null)
            {
                upit+=" AND a.prezime='"+podaci[1]+"'";
            }
        }
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("K.id");
                String naslov1=rs.getString("K.naslov");
                String ISBN=rs.getString("K.ISBN");
                int godinaizdanja=rs.getInt("K.godinaizdanja");
                String zanr=rs.getString("K.zanr");
                Zanr z=Zanr.valueOf(zanr);
                int ida=rs.getInt("A.id");
                String ime=rs.getString("A.ime");
                String prezime=rs.getString("A.prezime");
                int godina=rs.getInt("A.godina");
                String biografija=rs.getString("A.biografija");
                
                Autor a=new Autor(ida,ime,prezime,godina,biografija);
                Knjiga kn=new Knjiga(id,naslov1,a,ISBN,godinaizdanja,z);
                k.add(kn);
            }
        } catch (SQLException ex) {
            System.out.println("G");
        }
        return k;
    }
}
