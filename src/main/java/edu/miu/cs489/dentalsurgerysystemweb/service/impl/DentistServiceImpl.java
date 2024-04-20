package edu.miu.cs489.dentalsurgerysystemweb.service.impl;

import edu.miu.cs489.dentalsurgerysystemweb.model.Dentist;
import edu.miu.cs489.dentalsurgerysystemweb.repository.DentistRepository;
import edu.miu.cs489.dentalsurgerysystemweb.service.DentistService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DentistServiceImpl implements DentistService {

    private final DentistRepository dentistRepository;

    @Override
    public Dentist addNewDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist getDentistById(Long id) throws EntityNotFoundException {
        return dentistRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Dentist id " + id + " not found."));
    }

    @Override
    public Dentist updateDentistById(Long id, Dentist updatedDentist) {
        //check for a valid id
        Dentist dentist = getDentistById(id);
        dentist.setFirstName(updatedDentist.getFirstName());
        dentist.setLastName(updatedDentist.getLastName());
        dentist.setPhone(updatedDentist.getPhone());
        dentist.setEmail(updatedDentist.getEmail());
        dentist.setSpecialization(updatedDentist.getSpecialization());
        return dentistRepository.save(dentist);
    }

    @Override
    public void deleteDentistById(Long id) {
        dentistRepository.deleteById(id);
    }
}
