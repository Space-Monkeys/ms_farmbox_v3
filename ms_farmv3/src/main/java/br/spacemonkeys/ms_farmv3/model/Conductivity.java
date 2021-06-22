package br.spacemonkeys.ms_farmv3.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Conductivity {
    @Id
    private Long id;

    private Integer value;

    @Setter
    private  Clock createdAt = new Clock(
            LocalDateTime.now().getDayOfMonth(),
            LocalDateTime.now().getMonth().getValue(),
            LocalDateTime.now().getYear(),
            LocalDateTime.now().getHour(),
            LocalDateTime.now().getMinute(),
            LocalDateTime.now().getSecond()
    );

    public Conductivity() {
    }

    public Conductivity(Long id, Integer value) {
        this.id = id;
        this.value = value;
    }
}
