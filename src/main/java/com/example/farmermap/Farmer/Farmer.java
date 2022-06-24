package com.example.farmermap.Farmer;

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
    private Integer id;
    private String name;
    private String fileName;

    public Farmer() {

    }
}
