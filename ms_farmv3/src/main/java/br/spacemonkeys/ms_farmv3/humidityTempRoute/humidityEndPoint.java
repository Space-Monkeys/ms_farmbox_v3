package br.spacemonkeys.ms_farmv3.humidityTempRoute;

import br.spacemonkeys.ms_farmv3.humidityTempRoute.dto.HtRequest;
import br.spacemonkeys.ms_farmv3.model.HtModel;
import br.spacemonkeys.ms_farmv3.repository.HTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v3")
public class humidityEndPoint {

    @Autowired
    private HTRepository htRepository;

    @PostMapping("/ht")
    ResponseEntity create(@RequestBody HtRequest request){

        HtModel response = htRepository.save(request.toModel());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }



}
