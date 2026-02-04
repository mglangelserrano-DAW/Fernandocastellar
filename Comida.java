public class Comida {
    private String nombre;
    private String tipo; 
    private int cantidad; 
    public Comida(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void mostrarInfo() {
        System.out.println("Comida: " + nombre + ", tipo: " + tipo + ", cantidad: " + cantidad + "g");
    }
}
