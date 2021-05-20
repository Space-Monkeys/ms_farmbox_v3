package br.spacemonkeys.ms_farmv3.conductivityroute.dto;

import br.spacemonkeys.ms_farmv3.model.Conductivity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConductivityRequest {

    private Long id;
    private Integer value;

    public Conductivity toModel() {
        return new Conductivity(
                this.id,
                this.value
        );
    }
}
