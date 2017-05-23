
/**
 * Write a description of class SensorUltrasonido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SensorUltrasonido extends Sensor
{
    // instance variables - replace the example below with your own
    private String unidadMedida = "";
    private double distancia;
    private double alcanceMax;

    /**
     * Constructor for objects of class SensorUltrasonido
     */
    public SensorUltrasonido(){}
    public SensorUltrasonido(String fabricante, String codFabricante, int codSensor, String descripcionSen, double precioFab, String unidadMedida, double alcanceMax)
    {
       super(fabricante, codFabricante, codSensor, descripcionSen = "Sensor que permite calcular la distancia entre un objeto y el robot", precioFab);
       this.unidadMedida = unidadMedida;
       this.alcanceMax = alcanceMax;
    }

    // Metodos get y set
    public String getUnidadMedida(){
        if(distancia == 1 || alcanceMax == 1){
            unidadMedida = "metro";
        }else{
            unidadMedida = "metros";
        }
        return unidadMedida;
    }
    public double getDistancia(){
        return distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    public double getAlcanceMax(){
        return alcanceMax;
    }
    public void setAlcanceMax(double alcanceMax){
        this.alcanceMax = alcanceMax;
    }
    // Metodo de comportamiento
    public void imprimeInfoUltrasonidos(){
        super.printInfo();
        System.out.println("Alcance máximo del sensor: " + alcanceMax + " " + unidadMedida);        
    }
}
