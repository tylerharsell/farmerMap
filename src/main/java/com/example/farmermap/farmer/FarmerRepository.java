package com.example.farmermap.farmer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;

@Repository
public interface FarmerRepository
        extends JpaRepository<Farmer, Long> {
}
