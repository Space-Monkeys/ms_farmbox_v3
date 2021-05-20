package br.spacemonkeys.ms_farmv3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HtValues {
    private String humidity;
    private String temperature;
}
