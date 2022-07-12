package ru.alexleru.datasensorapi.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "sensors_data")
public class DataSensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uuid")
    private int uuid;

    @Column(name = "datetime_data")
    //@CreationTimestamp
    private Date dateTime;

    @Column(name = "mq2")
    private double mq2;

    @Column(name = "mq9")
    private double mq9;

    @Column(name = "mq135")
    private double mq135;

    @Column(name = "tempDHT11")
    private double tempDHT11;

    @Column(name = "humidityDHT11")
    private double humidityDHT11;

    @Column(name = "tempDS1820")
    private double tempDS1820;

    @Column(name = "description")
    private String description;

    public DataSensor() {
    }

    public DataSensor(double mq2, double mq9, double mq135, double tempDHT11,
                      double humidityDHT11, double tempDS1820, String description) {
        this.mq2 = mq2;
        this.mq9 = mq9;
        this.mq135 = mq135;
        this.tempDHT11 = tempDHT11;
        this.humidityDHT11 = humidityDHT11;
        this.tempDS1820 = tempDS1820;
        this.description = description;
    }

    public int getUuid() {
        return uuid;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public double getMq2() {
        return mq2;
    }

    public void setMq2(double mq2) {
        this.mq2 = mq2;
    }

    public double getMq9() {
        return mq9;
    }

    public void setMq9(double mq9) {
        this.mq9 = mq9;
    }

    public double getMq135() {
        return mq135;
    }

    public void setMq135(double mq135) {
        this.mq135 = mq135;
    }

    public double getTempDHT11() {
        return tempDHT11;
    }

    public void setTempDHT11(double tempDHT11) {
        this.tempDHT11 = tempDHT11;
    }

    public double getHumidityDHT11() {
        return humidityDHT11;
    }

    public void setHumidityDHT11(double humidityDHT11) {
        this.humidityDHT11 = humidityDHT11;
    }

    public double getTempDS1820() {
        return tempDS1820;
    }

    public void setTempDS1820(double tempDS1820) {
        this.tempDS1820 = tempDS1820;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DataSensor{" +
                "uuid=" + uuid +
                ", dateTime=" + dateTime +
                ", mq2=" + mq2 +
                ", mq9=" + mq9 +
                ", mq135=" + mq135 +
                ", tempDHT11=" + tempDHT11 +
                ", humidityDHT11=" + humidityDHT11 +
                ", tempDS1820=" + tempDS1820 +
                ", description=" + description +
                '}';
    }

    public String getFormatterDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy HH:mm");
        return formatter.format(dateTime);
    }
}
