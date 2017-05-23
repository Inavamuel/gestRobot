public class Lanzador{
    public static void main(String[] args){
        Robot rob1 = new Robot(PlataformaBase.ALFA, 1);
        Sensor senGen1 = new Sensor("OkRobotics", "Ok006", 60006, "Sensor fotorresistente", 21.54);
        Sensor senGen2 = new Sensor("UsLabs", "US0001", 20001, "Sensor de presión variable", 2.35);
        //SensorUltrasonido senUltra1 = new SensorUltrasonido("UsLabs", "US0001", 20001, "", 2.35, "", 1.2, 5.0);
        SensorLDR ldr1 = new SensorLDR("Arca Systemas", "AS0004", 70004, "", 18.5, Sensibilidad.ALTA);
        SensorLDR ldr2 = new SensorLDR("Arca Systemas", "AS0003", 70003, "", 6.5, Sensibilidad.BAJA);
        
        rob1.addSensor(senGen1, 1);
        rob1.addSensor(senGen2, 1);
        //rob1.addSensor(senUltra1, 1);
        rob1.addSensor(ldr1, 1);
        rob1.addSensor(ldr2, 1);
        
        rob1.printListaSensores();
        
    }
}