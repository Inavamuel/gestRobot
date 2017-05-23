public class LanzadorPrueba{
    public static void main(String[] args){
        Sensor s1 = new Sensor("Merchan", "M0001", 10001, "Sensor de humedad", 11.02);
        Sensor s2 = new Sensor("Merchan", "M0006", 10006, "Sensor de temperatura", 15.02);
        Sensor s3 = new Sensor("USLabs", "US0002", 20002, "Giroscopo", 17.35);
        Sensor s4 = new Sensor();
        s4.setNombreFabricante("UkTrnd");
        s4.setCodigoFabricante("Uk0008");
        s4.setCodigoSensor(3000);
        //s4.printInfo();
        s4.setDescripcionSensor("Acelerometro de tres ejes");
        s4.setPrecioFabrica(18.00);
        //s4.printInfo();
        Sensor s5 = new Sensor("OkRobotics", "Ok006", 60006, "Sensor fotorresistente", 21.54);
        Sensor s6 = new Sensor("UsLabs", "US0001", 20001, "Sensor de presión variable", 2.35);
        
        
        Robot rob1 = new Robot(PlataformaBase.ALFA, 1);
        rob1.addSensor(s1, 1);
        rob1.addSensor(s2, 1);
        rob1.addSensor(s5, 1);
        Robot rob2 = new Robot(PlataformaBase.BETA, 2);
        rob2.addSensor(s1, 1);
        rob2.addSensor(s3, 1);
        rob2.addSensor(s4, 1);
        Robot rob3 = new Robot(PlataformaBase.ALFA, 3);
        rob3.addSensor(s1, 1);
        rob3.addSensor(s3, 1);
        rob3.addSensor(s5, 1);
        Robot rob4 = new Robot(PlataformaBase.ALFA, 4);
        rob4.addSensor(s1, 1);
        rob4.addSensor(s3, 1);
        rob4.addSensor(s5, 1);
        Robot rob5 = new Robot(PlataformaBase.GAMMA, 5);
        rob5.addSensor(s2, 1);
        rob5.addSensor(s2, 1);
        rob5.addSensor(s5, 1);
        //rob1.printListaSensores();
        //rob1.eliminarSensor(101);
        //rob1.printInfoRobot();
        //rob1.precioVentaRobot();
        Robot rob6 = new Robot(PlataformaBase.ALFA, 6);
        rob6.addSensor(s1, 1);
        rob6.addSensor(s3, 1);
        rob6.addSensor(s5, 1);
        
        Pedido orden1 = new Pedido(001, "Mercedes Benz Madrid", "c/ Cartagena, 306");
        orden1.addRobot(rob1);
        orden1.addRobot(rob2);
        orden1.addRobot(rob3);
        orden1.addRobot(rob4);
        orden1.addRobot(rob5);
        orden1.addRobot(rob6);
        orden1.eliminaRobot(2);
        rob1.precioVentaRobot();
        //orden1.printListaRobots();
        orden1.printPedido();
        
        //Segundo pedido parte 4.2.3
        Pedido orden2 = new Pedido(002, "Enaire", "c/ Bravo Murillo, 37b");
        SensorLDR ldr01 = new SensorLDR("LD Systems", "LD0089", 90089,"",5.0,Sensibilidad.BAJA);
        SensorPresion pres01 = new SensorPresion("PressInc", "PI0065", 80065, "", 25.0, 1.0);
        SensorDetectObst detObst01 = new SensorDetectObst("LD Systems", "LD0071", 90071, "", 15.0, Sensibilidad.MEDIA);
        Robot r02S01 = new Robot(PlataformaBase.ALFA, 1);
        r02S01.addSensor(ldr01, 1);
        r02S01.addSensor(pres01, 10);
        r02S01.addSensor(detObst01, 1);
        r02S01.precioVentaRobot();
        SensorUltrasonido Ultra01 = new SensorUltrasonido("PressInc", "PI0049", 80049, "", 30.0, "", 10.0);
        SensorPresion pres02 = new SensorPresion("PressInc", "PI0066", 80066, "", 29.0, 1.5);
        SensorDetectObst detObst02 = new SensorDetectObst("LD Systems", "LD0072", 90072, "", 15.0, Sensibilidad.ALTA);
        Robot r02S02 = new Robot(PlataformaBase.BETA, 2);
        r02S02.addSensor(Ultra01, 1);
        r02S02.addSensor(pres02, 1);
        r02S02.addSensor(detObst02, 1);
        r02S02.precioVentaRobot();
        SensorLDR ldr02 = new SensorLDR("LD Systems", "LD0087", 90087,"",7.0,Sensibilidad.ALTA);
        SensorPresion pres03 = new SensorPresion("PressInc", "PI0069", 80069, "", 20.0, 0.8);
        SensorInfrarrojos infraRed01 = new SensorInfrarrojos("InfraSensInc", "IFR0070", 10070, "", 45.0, 0.1);
        SensorCCD ccd01 = new SensorCCD("BenT", "BTR0006", 12006, "", 75.0, 1024);
        SensorDetectObst detObst03 = new SensorDetectObst("LD Systems", "LD0073", 90073, "", 12.0, Sensibilidad.BAJA);
        Robot r02S03 = new Robot(PlataformaBase.GAMMA, 3);
        r02S03.addSensor(ldr02, 1);
        r02S03.addSensor(pres03, 5);
        r02S03.addSensor(infraRed01, 1);
        r02S03.addSensor(ccd01, 4);
        r02S03.addSensor(detObst03, 1);
        r02S03.precioVentaRobot();
        orden2.addRobot(r02S01);
        orden2.addRobot(r02S02);
        orden2.addRobot(r02S03);
        orden2.calculaPrecioTotal();
        //orden2.printListaRobots();
        //orden2.printPedido();
    }
}