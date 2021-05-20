package br.spacemonkeys.ms_farmv3.nutrientsEndRoute.dto;

import br.spacemonkeys.ms_farmv3.model.NutValues;
import br.spacemonkeys.ms_farmv3.model.Nutrients;
import br.spacemonkeys.ms_farmv3.repository.NutrientRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

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

    public Nutrients toModel(NutrientRepository nutrientRepository){
        var reponse = nutrientRepository.findById(id);
        if(reponse.isPresent()){
            var value = reponse.get().getValues();
            value.add(new NutValues(micro,macro));
            return  new Nutrients(id,value);
        }else{
            var def = new ArrayList<NutValues>();
            def.add(new NutValues(micro,macro));
            return new Nutrients(id,def);
        }
    }


}
