package speir.terra.types;

import org.joda.time.DateTime;

public class Clouds implements WeatherType {
    boolean system_unit = true;
    private Double reading;
    private DateTime start_time;
    private DateTime end_time;

    public Clouds() {
        setMetric();
    }

    public Double getCloud(){
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
