package br.spacemonkeys.ms_farmv3.humidityTempRoute.dto;

import br.spacemonkeys.ms_farmv3.model.HtModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HtRequest {
    @NotNull
    private Long id;
    @NotBlank
    private String humidity;
    @NotBlank
    private String temperature;

    public HtModel toModel(){
        return new HtModel(
                this.id,
                this.humidity,
                this.temperature
        );
    }
}
