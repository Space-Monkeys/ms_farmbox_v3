package br.spacemonkeys.ms_farmv3.model;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Nutrients {
    @Id
    private Long id;
    private  Clock createdAt = new Clock(
            LocalDateTime.now().getDayOfMonth(),
            LocalDateTime.now().getMonth().getValue(),
            LocalDateTime.now().getYear(),
            LocalDateTime.now().getHour(),
            LocalDateTime.now().getMinute(),
            LocalDateTime.now().getSecond()
    );
    private String micro;
    private String macro;

    @Deprecated
    public Nutrients() {
    }

    public Nutrients(Long id, String micro, String macro) {
        this.id = id;
        this.micro = micro;
        this.macro = macro;
    }

    public Long getId() {
        return id;
    }

    public Clock getCreatedAt() {
        return createdAt;
    }

    public String getMicro() {
        return micro;
    }

    public String getMacro() {
        return macro;
    }
}
