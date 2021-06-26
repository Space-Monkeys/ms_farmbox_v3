package br.spacemonkeys.ms_farmv3.conductivityroute.dto;

import br.spacemonkeys.ms_farmv3.model.ConductValues;
import br.spacemonkeys.ms_farmv3.model.Conductivity;
import br.spacemonkeys.ms_farmv3.repository.ConductivityRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ConductivityRequest {

    @NotNull
    private Long id;
    @NotNull
    private Integer value;

    public Conductivity toModel(ConductivityRepository repository) {

        var response = repository.findById(id);

        if(response.isPresent()){
            var values = response.get().getValues();
            values.add(new ConductValues(this.value));
            return response.get();
        }else{
            var def = new ArrayList<ConductValues>();
            def.add(new ConductValues(this.value));
            return new Conductivity(this.id,def);
        }

    }
}
