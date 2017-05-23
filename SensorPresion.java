
/**
 * Write a description of class SensorPresion here.
 * clase que extiende a la clase sensor y que define un sensor de presión. cada sensor tendrá un valor maximo de presion medido en N/mm²
 * 
 * @author iNavamuel 
 * @version v0.1
 */
public class SensorPresion extends Sensor
{
    // instance variables - replace the example below with your own
    private double presionMax;

    /**
     * Constructor for objects of class SensorPresion
     */
    public SensorPresion(){} //constructor generico
    public SensorPresion(String fabricante, String codFabricante, int codSensor, String descripcionSen, double precioFab, double presionMax){
        super(fabricante, codFabricante, codSensor, descripcionSen = "Sensor que se utiliza como medidor de Fuerza", precioFab);
        this.presionMax = presionMax;
    }

    /*
     * Metodos get y set para definir y consultar la presión máxima que puede soportar el sensor
     * 
     */
    public double getPresionMaxima(){
        return presionMax;
    }
    public void setPresionMaxima(double presionMax){
        this.presionMax = presionMax;
    }
    public void imprimeInfoSensorPresion(){
        super.printInfo();
        System.out.println("Presión máxima admitida: " + presionMax);
    }
}

