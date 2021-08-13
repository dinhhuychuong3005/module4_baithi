package com.example.demo.repository;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends JpaRepository<Country,Long> {
}
