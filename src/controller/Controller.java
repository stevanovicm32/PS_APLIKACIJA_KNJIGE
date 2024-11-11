/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import domain.Autor;
import domain.Knjiga;
import domain.Zanr;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Controller {
    private List<Knjiga> listaKnjiga= new ArrayList<>();
    private List<Autor> listaAutora= new ArrayList<>();
    
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
        Autor a1=new Autor("Ivo", "Andric", 1892, "bla bla");
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
        listaKnjiga.add(k3);
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
}
