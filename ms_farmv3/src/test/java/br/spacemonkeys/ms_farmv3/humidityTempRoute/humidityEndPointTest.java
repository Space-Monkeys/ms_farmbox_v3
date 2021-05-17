package br.spacemonkeys.ms_farmv3.humidityTempRoute;

import br.spacemonkeys.ms_farmv3.humidityTempRoute.dto.HtRequest;
import br.spacemonkeys.ms_farmv3.repository.HTRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
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

@SpringBootTest
@AutoConfigureMockMvc
class humidityEndPointTest {

    @Autowired
    private HTRepository htRepository;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    void setup(){
        htRepository.deleteAll();
    }

    @Test
    @DisplayName("SUCESSO ao inserir info de humidade e temperatura")
    void createTest() throws Exception {

        HtRequest request = new HtRequest(
                12L,
                "10.00",
                "25"
        );

        mockMvc.perform(MockMvcRequestBuilders.post("/api/v3/ht")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(request)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(MockMvcResultHandlers.print());

    }


}