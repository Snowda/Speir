package speir.terra.types;

import org.joda.time.DateTime;

public class Wind {
    private String system_unit = "°C";
    private Double reading;
    private DateTime start_time;
    private DateTime end_time;
    private Double direction;
    private Double speed;

    public Wind() {
        setMetric();
    }

    public Double getWind(){
        return reading;
    }

    public void setUnit(boolean new_unit) {
        if(new_unit) {
            system_unit = "°C";
        } else {
            system_unit = "°F";
        }
    }

    public void setMetric() {
        setUnit(true);
    }

    public void setImperial() {
        setUnit(false);
    }
}
