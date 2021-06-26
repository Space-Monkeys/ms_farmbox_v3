package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ConductValues {

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

    public ConductValues() {
    }

    public ConductValues(Integer value) {
        this.value = value;
    }
}
