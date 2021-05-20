package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.annotation.sql.DataSourceDefinition;
import java.time.LocalDateTime;

public class HtModel {
    @Id
    private Long id;
    private final Clock createdAt = new Clock(
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
