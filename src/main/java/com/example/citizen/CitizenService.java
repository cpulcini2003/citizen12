package com.example.citizen;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CitizenService {
    
    private final CitizenRepository citizenRepository;

    public CitizenService(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    public List<Citizen> getAll() {
        System.out.println(citizenRepository.findAll());
        return citizenRepository.findAll();
    }

    public void insert(Citizen citizen) {
        citizenRepository.save(citizen);
        System.out.println("citizen" + citizen.toString());
    }

    public void insert3() {
        citizenRepository.save(new Citizen(LocalDate.of(2000, Month.JANUARY, 5),"Mario","Rossi","123"));
        citizenRepository.save(new Citizen(LocalDate.of(2001, Month.FEBRUARY, 6),"Paolo","Bianchi","456"));
        citizenRepository.save(new Citizen(LocalDate.of(2002, Month.MARCH, 7),"Giuseppe","Verdi","789"));
    }
}
