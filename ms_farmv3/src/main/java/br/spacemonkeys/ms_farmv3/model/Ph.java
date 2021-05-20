package br.spacemonkeys.ms_farmv3.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Ph {
    @Id
    private Long id;
    private List<Integer> value;

    public Ph(Long id, List<Integer> value) {
        this.id = id;
        this.value = value;
    }

    @Deprecated
    public Ph() {
    }

    public Long getId() {
        return id;
    }

    public List<Integer> getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value.add(value);
    }

}
