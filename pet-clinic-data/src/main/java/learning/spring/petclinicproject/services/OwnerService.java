package learning.spring.petclinicproject.services;

import learning.spring.petclinicproject.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastNme);
    Owner fndById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
