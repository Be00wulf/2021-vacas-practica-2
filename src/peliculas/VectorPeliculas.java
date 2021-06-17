package src.peliculas;
import src.tienda.*;

public class VectorPeliculas {
    //variables
    private Pelicula[] peli = new Pelicula[50];
    private Pelicula[] peliprest = new Pelicula[50];
    private int siguienteCodigoP;
    
    //constructor
    public VectorPeliculas(){
        siguienteCodigoP = 1;
    }
    
    //prestar pelis
    public void prestarPeliculas(String peliNombre, int peliID, boolean peliDisponibilidad){
        if (siguienteCodigoP > 50){
            System.out.println("Limite de peliculas alcanzado");
        }
        else{
            peliprest[(siguienteCodigoP-1)] = new Pelicula(peliNombre, siguienteCodigoP, false);
        }
        siguienteCodigoP++;
    }
    
    public void agregarPeliculaPrestada(){
        String peliNombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        int peliID = IngresoDatos.getEntero("Ingrese el ID de la pelicula", false);
        prestarPeliculas(peliNombre, peliID, false);
    }

    //agregar pelis
    public void agregarPeli(String peliNombre, String peliCategoria, int peliAnio, boolean peliDisponibilidad){
        if (siguienteCodigoP > 50){
            System.out.println("Limite de peliculas alcanzado");
        }
        else{
            peli[(siguienteCodigoP-1)] = new Pelicula(peliNombre, peliCategoria, siguienteCodigoP, peliAnio, true);
        }
        siguienteCodigoP++;
    }
    
    public void agregarPelicula(){
        String peliNombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula");
        String peliCategoria = IngresoDatos.getTexto("Ingrese la Categoria de la pelicula");
        int peliAnio = IngresoDatos.getEntero("Ingrese el año que salio la pelicula", false);
        agregarPeli(peliNombre, peliCategoria, peliAnio, true);
    }
    
    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas de memorabilia");
        for (int i = 0; i < (siguienteCodigoP-1); i++) {
            System.out.println("-"+i+") "+peli[i].toString());   
        }
        System.out.println("\n\n");
    }
    
    
    //Ordenamiento
    public void ordenarPorNombrePeli(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigoP-1); i++) {
            for (int j = 0; j < (siguienteCodigoP-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peli[j].getPeliNombre().compareTo(peli[j+1].getPeliNombre()) > 0 );
                else 
                    cambio= (peli[j].getPeliNombre().compareTo(peli[j+1].getPeliNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peli[j];
                    peli[j] = peli[j+1];
                    peli[j+1]= aux;
                }
            }
        }

    }
    
    
    
    
    
    
}
