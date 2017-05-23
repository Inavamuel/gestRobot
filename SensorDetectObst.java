
/**
 * Write a description of class SensorDetectObst here.
 * 
 * @author iNavamuel 
 * @version v0.1 (14/05/17)
 */
public class SensorDetectObst extends Sensor
{
    // instance variables - replace the example below with your own
    private Sensibilidad sensibilidad;

    /**
     * Constructor for objects of class SensorDetectObst
     */
    public SensorDetectObst(){}
    public SensorDetectObst(String fabricante, String codFabricante, int codSensor, String descripcionSen, double precioFab, Sensibilidad sensibilidad)
    {
        super(fabricante, codFabricante, codSensor, descripcionSen = "Sensor capaz de detectar objetos cercanos", precioFab);
        this.sensibilidad = sensibilidad;
    }

    /**
     * metodos get y set
     */
    public Enum getSensibilidad(){
        return sensibilidad;
    }
    public void setSensibilidad(Sensibilidad sensibilidad){
        this.sensibilidad = sensibilidad;
    }
    public void imprimeInfoDetectObst(){
        super.printInfo();
        System.out.println("Sensibilidad: " + sensibilidad);
    }
}
