
/**
 * Clase sensor tipo.
 * 
 * @author 53003151L-navamuel 
 * @version v0.1
 */
public class Sensor
{
    // variables 
    private String nombreFabricante;
    private String codigoFabricante;
    private int codigoSensor;
    private String descripcionSensor;
    private double precioSensorFabrica;

    /**
     * Constructores para los objetos de la clase Sensor
     */
    public Sensor(){} //constructor generico
    public Sensor(String fabricante, String codFabricante, int codSensor, String descripcionSen, double precioFab){
        this.nombreFabricante = fabricante;
        this.codigoFabricante = codFabricante;
        this.codigoSensor = codSensor;
        this.descripcionSensor = descripcionSen;
        this.precioSensorFabrica = precioFab;
    }
    
    /**
     * Metodos get
     * 
     * @param  nombreFabricante, codigoFabricante, codigoSensor, descripcionSensor, precioSensorFabrica
     * @return nombreFabricante, codigoFabricante, codigoSensor, descripcionSensor, precioSensorFabrica
     */
    public String getNombreFabricante(){
        return nombreFabricante;
    }
    public String getCodigoFabricante(){
        return codigoFabricante;
    }
    public int getCodigoSensor(){
        return codigoSensor;
    }
    public String getDescripcionSensor(){
        return descripcionSensor;
    }
    public double getPrecioFabrica(){
        return precioSensorFabrica;
    }
    
    /**
     * Metodos set
     * @param nombreFab, codFab, codSens, descrip, precioFab
     */
    public void setNombreFabricante(String nombreFab){
        nombreFabricante = nombreFab;
    }
    public void setCodigoFabricante(String codFab){
        codigoFabricante = codFab;
    }
    public void setCodigoSensor(int codSens){
        codigoSensor = codSens;
    }
    public void setDescripcionSensor(String descrip){
        descripcionSensor = descrip;
    }
    public void setPrecioFabrica(double precioFab){
        precioSensorFabrica = precioFab;
    }
    
    /* Métodos de comportamiento
     * método printInfo()
     */
    public void printInfo(){
        System.out.println("\nDescripción del sensor: " + descripcionSensor);
        System.out.println("Nombre del fabricante: " + nombreFabricante);
        System.out.println("Código del fabricante: " + codigoFabricante);
        System.out.println("Código del sensor: " + codigoSensor);
        System.out.println("Precio de fábrica del sensor: " + precioSensorFabrica + "€");
    }
}
