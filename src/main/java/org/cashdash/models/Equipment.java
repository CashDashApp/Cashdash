package org.cashdash.models;

import java.time.LocalDate;

public class Equipment extends Item {
    private String type;
    private LocalDate datein;
    private String condtion;

    public Equipment(int id, String type, LocalDate datein, String condtion, String name, Integer stock) {
        super(id, name, stock);
        this.type = type;
        this.datein = datein;
        this.condtion = condtion;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDatein(LocalDate datein) {
        this.datein = datein;
    }

    public void setCondtion(String condtion) {
        this.condtion = condtion;
    }

    public String getType() {
        return type;
    }

    public LocalDate getDatein() {
        return datein;
    }

    public String getCondtion() {
        return condtion;
    }
}
