package com.kindsonthegenius.BRSApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kindsonthegenius.BRSApp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
