package learning.spring.petclinicproject.services.map;

import learning.spring.petclinicproject.models.PetType;
import learning.spring.petclinicproject.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType entity) {
        super.delete(entity);

    }

    @Override
    public PetType save(PetType entity) {
        return super.save(entity.getId(),entity);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
