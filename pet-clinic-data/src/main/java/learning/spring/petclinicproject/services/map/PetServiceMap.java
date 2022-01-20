package learning.spring.petclinicproject.services.map;

import learning.spring.petclinicproject.models.Pet;
import learning.spring.petclinicproject.services.CrudService;
import learning.spring.petclinicproject.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet entity) {
        super.delete(entity);
    }

    @Override
    public Pet save(Pet entity) {
        return super.save(entity.getId(),entity);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
