/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import baza.DBBroker;
import domain.Autor;
import domain.Knjiga;
import domain.User;
import domain.Zanr;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Lenovo
 */
public class Controller {
    private DBBroker dbb;
    private List<Knjiga> listaKnjiga= new ArrayList<>();
    private List<Autor> listaAutora= new ArrayList<>();
    private List<User> listaUsera=new ArrayList<>();

    public List<User> getListaUsera() {
        return listaUsera;
    }

    public void setListaUsera(List<User> listaUsera) {
        this.listaUsera = listaUsera;
    }
    
    private static Controller instance;
    public static Controller getInstance(){
        if(instance==null)
        {
            instance= new Controller();
        }
        return instance;
    }
    
    private Controller()
    {
        dbb=new DBBroker();
        
        User m=new User(1, "Masa", "masa");
        listaUsera.add(m);
        /*Autor a1=new Autor("Ivo", "Andric", 1892, "bla bla");
        Autor a2=new Autor("Danilo", "Kis", 1935, "bla bla");
        Autor a3=new Autor("Mesa", "Selimovic", 1910, "bla bla");
        
        Knjiga k1=new Knjiga("Na drini cuprija", a1, "3232323232", 1945, Zanr.ROMAN);
        Knjiga k2=new Knjiga("Basta, pepeo", a2, "3131313131", 1982, Zanr.ISTORIJSKI);
        Knjiga k3=new Knjiga("Tvrdjava", a3, "303030303030", 1970, Zanr.POEZIJA);
        
        listaAutora.add(a1);
        listaAutora.add(a2);
        listaAutora.add(a3);
        
        listaKnjiga.add(k1);
        listaKnjiga.add(k2);
        listaKnjiga.add(k3);*/
    }

    public List<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(List<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public List<Autor> getListaAutora() {
        return listaAutora;
    }

    public void setListaAutora(List<Autor> listaAutora) {
        this.listaAutora = listaAutora;
    }
    
    public void obrisiKnjigu(int selektovaniRed)
    {
        listaKnjiga.remove(selektovaniRed);
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        listaKnjiga.add(novaKnjiga);
    }

    public List<Knjiga> ucitajListuKnjiga() {
        return dbb.ucitajListuKnjiga();
    }

    public List<Autor> getListaAutoraIzBaze() {
        return dbb.ucitajListuAutora();
    }

    public void obrisiKnjiguIzBaze(int id) {
        dbb.obrisiKnjiguIzBaze(id);
    }

    public void dodajKnjiguUBazu(Knjiga novaKnjiga) {
        dbb.dodajKnjiguUBazu(novaKnjiga);
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        dbb.azurirajKnjigu(knjigaZaIzmenu);
    }

    public boolean login1(String ime, String password) {
        for (User u : listaUsera) {
            if(u.getIme().equalsIgnoreCase(ime)&&u.getSifra().equals(password))
            {
                return true;
            }
        }
        return false;
    }

    public boolean login2(String ime, String password) {
        return dbb.login2(ime, password);
    }

    public List<Knjiga> filtriraj(String autor, String naslov) {
        //preko memorije
        List<Knjiga> rezultat=new ArrayList<>();
        if(autor!=null&&naslov==null)
        {
            for(Knjiga k: listaKnjiga)
            {
                String autorKnjige=k.getAutor().getIme()+" "+k.getAutor().getPrezime();
                if(autorKnjige.contains(autor))
                {
                    rezultat.add(k);
                }
            }
        }
        else if(autor!=null&&naslov!=null)
        {
            for(Knjiga k: listaKnjiga)
            {
                String autorKnjige=k.getAutor().getIme()+" "+k.getAutor().getPrezime();
                if(autorKnjige.contains(autor)&&k.getNaslov().contains(naslov))
                {
                    rezultat.add(k);
                }
            }
        }
        else if(autor==null&&naslov!=null)
        {
            for(Knjiga k: listaKnjiga)
            {
                if(k.getNaslov().contains(autor))
                {
                    rezultat.add(k);
                }
            }
        }
        else
        {
            for(Knjiga k: listaKnjiga)
            {
                rezultat.add(k);
            }
        }
        /*
        List<Knjiga> rezultat2=new ArrayList<>();
        rezultat2=listaKnjiga.stream().filter(k->(naslov!=null&&k.getNaslov().contains(naslov))&&(autor!=null&&(k.getAutor().getIme()+" "+k.getAutor().getPrezime()).contains(autor))).collect(Collectors.toList());
        */
        
        return rezultat;
    }

    public List<Knjiga> filtriraj2(String autor, String naslov) {
        return dbb.filtriraj(autor, naslov);
    }
    
    
}
