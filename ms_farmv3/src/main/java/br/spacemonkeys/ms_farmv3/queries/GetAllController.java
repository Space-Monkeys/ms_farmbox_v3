package br.spacemonkeys.ms_farmv3.queries;

import br.spacemonkeys.ms_farmv3.repository.ConductivityRepository;
import br.spacemonkeys.ms_farmv3.repository.HTRepository;
import br.spacemonkeys.ms_farmv3.repository.NutrientRepository;
import br.spacemonkeys.ms_farmv3.repository.PhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class GetAllController {

    @Autowired
    private NutrientRepository nutrientRepository;

    @Autowired
    private HTRepository htRepository;

    @Autowired
    private PhRepository phRepository;

    @Autowired
    private ConductivityRepository conductivityRepository;

    @GetMapping("/all/{id}")
    public ResponseEntity findAll(@PathVariable(value = "id", required = true) Long id ){

        var nutri = nutrientRepository.findById(id);
        var ht = htRepository.findById(id);
        var ph = phRepository.findById(id);
        var conduct = conductivityRepository.findById(id);

        GelAllJson response = new GelAllJson();

        if(ht.isPresent()) response.setHtModelList(ht.get().getValues());

        if(nutri.isPresent()) response.setNutrientsList(nutri.get().getValues());

        if(ph.isPresent()) response.setPhList(ph.get().getValue());

        if(conduct.isPresent()) response.setConductivities(conduct.get());

        return ResponseEntity.ok(response);
    }
}
