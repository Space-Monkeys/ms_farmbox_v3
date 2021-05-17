package br.spacemonkeys.ms_farmv3.nutrientsEndRoute.dto;

import br.spacemonkeys.ms_farmv3.model.Nutrients;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NutrientsRequest {
    @NotNull
    private Long id;
    @NotBlank
    private String micro;
    @NotBlank
    private String macro;

    public Nutrients toModel(){
        return new Nutrients(
                this.id,
                this.micro,
                this.macro
        );
    }


}
