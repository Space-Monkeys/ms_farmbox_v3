package br.spacemonkeys.ms_farmv3.humidityTempRoute.dto;

import br.spacemonkeys.ms_farmv3.model.HtModel;
import br.spacemonkeys.ms_farmv3.model.HtValues;
import br.spacemonkeys.ms_farmv3.repository.HTRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

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

    public HtModel toModel(HTRepository repository){

        var response = repository.findById(id);

        if(response.isPresent()){
            var values = response.get().getValues();
            values.add(new HtValues(this.humidity, this.temperature));
            return new HtModel(this.id,values);

        }else{
            var def = new ArrayList<HtValues>();
            def.add(new HtValues(humidity,temperature));
            return new HtModel(this.id,def);
        }

    }
}
