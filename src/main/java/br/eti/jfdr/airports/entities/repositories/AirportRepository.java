/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.jfdr.airports.entities.repositories;

import br.eti.jfdr.airports.entities.Airport;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DIT2A
 */
public interface AirportRepository extends JpaRepository<Airport, Long> {
    
    List<Airport> findByCityIgnoreCase(String city);
    List<Airport> findByCountryIgnoreCase(String country);
    
    Airport findByIataCode(String iataCode);
    //devolve objeto aeroporto
}
