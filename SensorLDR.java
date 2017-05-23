public class SensorLDR extends Sensor {
    private Sensibilidad sensibilidad;
    public SensorLDR(){} //constructor generico
    public SensorLDR(String fabricante, String codFabricante, int codSensor, String descripcionSen, double precioFab, Sensibilidad sens){
        super(fabricante, codFabricante, codSensor, descripcionSen = "Sensor que detecta si es de día o de noche y enciende el sistema de iluminación del robot", precioFab);
        sensibilidad = sens;
    }
    //metodos get y set
    public Enum getSensibilidad(){
        return sensibilidad;
    }
    public void setSensibilidad(Sensibilidad sens){
        sensibilidad = sens;
    }
    public void imprimeInfoLDR(){
        super.printInfo();
        System.out.println("Sensibilidad: " + sensibilidad);
    }
}