package learning.spring.petclinicproject.services;

import learning.spring.petclinicproject.models.Pet;

import java.util.Set;

public interface PetService {
    Pet fndById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
