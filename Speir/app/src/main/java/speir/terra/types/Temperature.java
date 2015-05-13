package speir.terra.types;

public class Temperature implements WeatherType {
    boolean system_unit = true;
    private Double reading;

    public Temperature() {

    }

    public static Double getTemperature(){
        return reading;
    }

    public void setUnit(boolean new_unit) {
        system_unit = new_unit;
    }

    public void setMetric() {
        setUnit(true);
    }

    public void setImperial() {
        setUnit(false);
    }
}
