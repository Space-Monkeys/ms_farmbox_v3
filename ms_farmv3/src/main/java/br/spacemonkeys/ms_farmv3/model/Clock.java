package br.spacemonkeys.ms_farmv3.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Clock {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int second;

}
