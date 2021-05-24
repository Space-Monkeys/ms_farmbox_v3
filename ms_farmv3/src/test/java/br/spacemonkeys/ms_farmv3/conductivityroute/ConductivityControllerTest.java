package br.spacemonkeys.ms_farmv3.conductivityroute;

import br.spacemonkeys.ms_farmv3.conductivityroute.dto.ConductivityRequest;
import br.spacemonkeys.ms_farmv3.repository.ConductivityRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class ConductivityControllerTest {


    @Autowired
    private ConductivityRequest conductivityRequest;

    @Autowired
    private ConductivityRepository conductivityRepository;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setup(){
        conductivityRepository.deleteAll();
    }

    @Test
    @DisplayName("SUCESSO ao inserir info de condutividade")
    void createTest() throws Exception {

        ConductivityRequest request = new ConductivityRequest(
                12L,
                1
        );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v3/conductivity")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(MockMvcResultHandlers.print());

    }

}