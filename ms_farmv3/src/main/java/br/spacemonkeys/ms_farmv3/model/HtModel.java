package br.spacemonkeys.ms_farmv3.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class HtModel {
    @Id
    private Long id;
    private  Clock createdAt = new Clock(
            LocalDateTime.now().getDayOfMonth(),
            LocalDateTime.now().getMonth().getValue(),
            LocalDateTime.now().getYear(),
            LocalDateTime.now().getHour(),
            LocalDateTime.now().getMinute(),
            LocalDateTime.now().getSecond()
    );
    private String humidity;
    private String temperature;

    public HtModel(Long id, String humidity, String temperature) {
        this.id = id;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    @Deprecated
    public HtModel() {
    }

    public Long getId() {
        return id;
    }

    public Clock getCreatedAt() {
        return createdAt;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemperature() {
        return temperature;
    }
}
