package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class HtModel {
    @Id
    private Long id;
    private List<HtValues> values;

    public void setValues(String humidity, String temperature) {
        this.values.add(new HtValues(humidity,temperature));
    }
}
