package speir.terra.types;

import org.joda.time.DateTime;

public class Rain implements WeatherType {
    boolean system_unit = true;
    private Double reading;
    private DateTime start_time;
    private DateTime end_time;
    private Double chance;

    public Rain() {
        setMetric();
    }

    public Double getAmount(){
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
