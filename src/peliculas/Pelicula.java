package src.peliculas;

public class Pelicula {
    private String peliNombre;
    private String peliCategoria;
    private int peliID;
    private int peliAnio;
    private boolean peliDisponibilidad;
    
    //constructor
    public Pelicula(String peliNombre, String peliCategoria, int peliID, int peliAnio, boolean peliDisponibilidad){
        this.peliNombre = peliNombre;
        this.peliCategoria = peliCategoria;
        this.peliID = peliID;
        this.peliAnio = peliAnio;
        this.peliDisponibilidad = peliDisponibilidad;
    }
    
    //const2¿
    public Pelicula(String peliNombre, int peliID, boolean peliDisponibilidad){
        this(peliNombre, "Otro", 0, 0, true);
    }
    
    //getters y setters
    public String getPeliNombre() {
        return peliNombre;
    }

    public void setPeliNombre(String peliNombre) {
        this.peliNombre = peliNombre;
    }

    public String getPeliCategoria() {
        return peliCategoria;
    }

    public void setPeliCategoria(String peliCategoria) {
        this.peliCategoria = peliCategoria;
    }

    public int getPeliID() {
        return peliID;
    }

    public void setPeliID(int peliID) {
        this.peliID = peliID;
    }

    public int getPeliAnio() {
        return peliAnio;
    }

    public void setPeliAnio(int peliAnio) {
        this.peliAnio = peliAnio;
    }

    public boolean isPeliDisponibilidad() {
        return peliDisponibilidad;
    }

    public void setPeliDisponibilidad(boolean peliDisponibilidad) {
        this.peliDisponibilidad = peliDisponibilidad;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Pelicula=" + peliNombre + ", peliCategoria=" + peliCategoria + ", peliID=" + peliID + ", peliAño=" + peliAnio + ", peliDisponibilidad=" + peliDisponibilidad;
    }
    
}
