package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Ph {
    @Id
    private Long id;
    private Integer value;
    private Clock createdAt = new Clock(
            LocalDateTime.now().getDayOfMonth(),
            LocalDateTime.now().getMonth().getValue(),
            LocalDateTime.now().getYear(),
            LocalDateTime.now().getHour(),
            LocalDateTime.now().getMinute(),
            LocalDateTime.now().getSecond()
    );

    public Ph(Long id, Integer value) {
        this.id = id;
        this.value = value;
    }

    @Deprecated
    public Ph() {
    }

    public Long getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    public Clock getCreatedAt() {
        return createdAt;
    }
}
