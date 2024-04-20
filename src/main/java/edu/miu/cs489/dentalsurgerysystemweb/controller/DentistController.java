package edu.miu.cs489.dentalsurgerysystemweb.controller;

import edu.miu.cs489.dentalsurgerysystemweb.model.Dentist;
import edu.miu.cs489.dentalsurgerysystemweb.service.DentistService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/adsweb/api/v1/dentists")
public class DentistController {

    private final DentistService dentistService;

    @GetMapping
    public ResponseEntity<List<Dentist>> getAllDentists() {
        return ResponseEntity.ok(dentistService.getAllDentists());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentist> getDentistById(@PathVariable Long id) {
        return ResponseEntity.ok(dentistService.getDentistById(id));
    }

    @PostMapping
    public ResponseEntity<Dentist> addNewDentist(@RequestBody Dentist dentist) {
        return ResponseEntity.ok(dentistService.addNewDentist(dentist));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dentist> updateDentistById(@PathVariable Long id, @RequestBody Dentist updatedDentist) {
        return ResponseEntity.ok(dentistService.updateDentistById(id, updatedDentist));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDentistById(@PathVariable Long id) {
        dentistService.deleteDentistById(id);
        return ResponseEntity.ok("success");
    }
}
