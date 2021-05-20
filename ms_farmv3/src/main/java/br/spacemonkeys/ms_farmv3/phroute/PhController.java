package br.spacemonkeys.ms_farmv3.phroute;

import br.spacemonkeys.ms_farmv3.model.Ph;
import br.spacemonkeys.ms_farmv3.phroute.dto.PhRequest;
import br.spacemonkeys.ms_farmv3.repository.PhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3")
public class PhController {


    @Autowired
    private final PhRepository repository;

    public PhController(PhRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/ph")
    public ResponseEntity create(@RequestBody PhRequest request){
        Ph newPh = repository.save(request.toModel(repository));
        return ResponseEntity.status(HttpStatus.CREATED).body(newPh);
    }

    @GetMapping("/ph/{id}")
    public ResponseEntity findAll(@PathVariable(value = "id", required = true) Long id ){
        return ResponseEntity.ok(repository.findById(id));
    }



}
