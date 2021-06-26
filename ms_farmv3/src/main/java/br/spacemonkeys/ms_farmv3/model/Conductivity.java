package br.spacemonkeys.ms_farmv3.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conductivity {
    @Id
    private Long id;
    private List<ConductValues> values;

    public void setValues(Integer value) { this.values.add(new ConductValues(value));}

}
