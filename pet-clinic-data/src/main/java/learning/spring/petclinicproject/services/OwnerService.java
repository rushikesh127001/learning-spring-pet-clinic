package learning.spring.petclinicproject.services;

import learning.spring.petclinicproject.models.Owner;


public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastNme);

}
