package com.example.farmermap.farmer;

import javax.persistence.*;

@Entity
@Table
public class Farmer {

    @Id
    @SequenceGenerator(
            name = "farmer_sequence",
            sequenceName = "farmer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "farmer_sequence"
    )
    private Long id;
    private String name;
    private String fileName;

    public Farmer() {
    }

    public Farmer(Long id, String name, String fileName) {
        this.id = id;
        this.name = name;
        this.fileName = fileName;
    }

    public Farmer(String name, String fileName) {
        this.name = name;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
