package br.spacemonkeys.ms_farmv3.phroute.dto;

import br.spacemonkeys.ms_farmv3.model.Ph;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhRequest {

    private Long id;
    private Integer value;

    public Ph toModel() {
        return new Ph(
                this.id,
                this.value
        );
    }
}
