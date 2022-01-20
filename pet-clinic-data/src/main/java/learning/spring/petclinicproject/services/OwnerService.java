package learning.spring.petclinicproject.services;

import learning.spring.petclinicproject.models.Owner;
import org.springframework.stereotype.Service;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastNme);

}
