package br.spacemonkeys.ms_farmv3.phroute.dto;

import br.spacemonkeys.ms_farmv3.model.Ph;
import br.spacemonkeys.ms_farmv3.repository.PhRepository;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhRequest {

    @NotNull
    private Long id;
    @NonNull
    private Integer value;

    public Ph toModel(PhRepository repository) {

        var  register = repository.findById(this.id);
        if(register.isPresent()){
            List<Integer> item = register.get().getValue();
            item.add(value);
            return new Ph(this.id,item);
        }else {
            List<Integer> item = new ArrayList<Integer>();
            item.add(value);
            return new Ph(this.id,item);
        }

    }
}
