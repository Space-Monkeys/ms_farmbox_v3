package br.spacemonkeys.ms_farmv3.conductivityroute;

import br.spacemonkeys.ms_farmv3.conductivityroute.dto.ConductivityRequest;
import br.spacemonkeys.ms_farmv3.model.Conductivity;
import br.spacemonkeys.ms_farmv3.repository.ConductivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3")
public class ConductivityController {

    @Autowired
    private final ConductivityRepository repository;

    public ConductivityController(ConductivityRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/conductivity")
    public ResponseEntity create(@RequestBody ConductivityRequest request) {
        Conductivity newConductivity = repository.save(request.toModel(repository));
        return ResponseEntity.status(HttpStatus.CREATED).body(newConductivity);
    }

    @GetMapping("/conductivity/{id}")
    public ResponseEntity findAll(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok().body(repository.findById(id));
    }

}
