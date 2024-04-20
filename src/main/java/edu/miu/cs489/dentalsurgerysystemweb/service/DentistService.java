package edu.miu.cs489.dentalsurgerysystemweb.service;

import edu.miu.cs489.dentalsurgerysystemweb.model.Dentist;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

public interface DentistService {
    Dentist addNewDentist(Dentist dentist);
    List<Dentist> getAllDentists();
    Dentist getDentistById(Long id) throws EntityNotFoundException;
    Dentist updateDentistById(Long id, Dentist updatedDentist);
    void deleteDentistById(Long id);
}
