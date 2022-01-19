package learning.spring.petclinicproject.services;

import learning.spring.petclinicproject.models.Vet;

import java.util.Set;

public interface VetService
{
    Vet fndById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
