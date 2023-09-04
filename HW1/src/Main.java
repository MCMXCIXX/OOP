import DataBase.MeteoStore;
import NewSencor.ST500Info;
import NewSencor.SensorTemperature;
import OldSensor.MS200;
import OldSensor.MeteoSensor;

public class Main {

    public static void main(String[] args) {
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        SensorTemperature sensorTemperature = new ST500Info().getData();
        ST500InfoAdapter st500InfoAdapter = new ST500InfoAdapter(sensorTemperature);
        meteoDb.save(st500InfoAdapter);

    }
}