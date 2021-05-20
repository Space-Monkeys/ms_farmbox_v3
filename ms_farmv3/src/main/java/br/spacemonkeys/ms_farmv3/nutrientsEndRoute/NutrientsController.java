package br.spacemonkeys.ms_farmv3.nutrientsEndRoute;

import br.spacemonkeys.ms_farmv3.nutrientsEndRoute.dto.NutrientsRequest;
import br.spacemonkeys.ms_farmv3.repository.NutrientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v3")
public class NutrientsController {

    @Autowired
    private NutrientRepository nutrientRepository;

    @PostMapping("/nutri")
    ResponseEntity create(@RequestBody @Valid NutrientsRequest request){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(nutrientRepository.save(request.toModel(nutrientRepository)));
    }
    @GetMapping("/nutri/{id}")
    public ResponseEntity findAll(@PathVariable(value = "id", required = true) Long id ){
        return ResponseEntity.ok(nutrientRepository.findById(id));
    }

}
