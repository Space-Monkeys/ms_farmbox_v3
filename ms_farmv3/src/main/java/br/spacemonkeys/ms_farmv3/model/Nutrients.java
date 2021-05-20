package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nutrients {
    @Id
    private Long id;
    private List<NutValues> values;

    public void setValues(String micro, String macro) {
        this.values.add(new NutValues(micro,macro));
    }
}
