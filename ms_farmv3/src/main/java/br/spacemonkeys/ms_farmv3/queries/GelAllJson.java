package br.spacemonkeys.ms_farmv3.queries;

import br.spacemonkeys.ms_farmv3.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GelAllJson {

    @JsonProperty("nutrientes")
    private List<NutValues> nutrientsList;
    @JsonProperty("ph")
    private List<Integer> phList;
    @JsonProperty("humidade_temperatura")
    private List<HtValues> htModelList;
    @JsonProperty("condutividade")
    private Conductivity conductivities;
}
