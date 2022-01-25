package learning.spring.petclinicproject.bootstrapper;

import learning.spring.petclinicproject.models.Owner;
import learning.spring.petclinicproject.models.PetType;
import learning.spring.petclinicproject.models.Vet;
import learning.spring.petclinicproject.services.OwnerService;
import learning.spring.petclinicproject.services.PetTypeService;
import learning.spring.petclinicproject.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setPetType("Dog");
        petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setPetType("Cat");
        petTypeService.save(cat);

        //adding ownerss
        Owner owner1=new Owner();
        owner1.setFirstName("Rushi");
        owner1.setLastName("Chaskar");
        owner1.setId(1L);
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Sushi");
        owner2.setLastName("Raskar");
        owner2.setId(2L);

        ownerService.save(owner2);

        Owner owner3=new Owner();
        owner3.setFirstName("Pushi");
        owner3.setLastName("khaskar");
        owner3.setId(3L);

        ownerService.save(owner3);

        System.out.println("Owners Loaded");
        System.out.println(ownerService.findAll().size());

        Vet vet1=new Vet();
        vet1.setFirstName("vetFN1");
        vet1.setLastName("vetLN1");
        vet1.setId(1L);

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("vetFN2");
        vet2.setLastName("vetLN2");
        vet2.setId(2L);

        vetService.save(vet2);

        Vet vet3=new Vet();
        vet3.setFirstName("vetFN3");
        vet3.setLastName("vetLN3");
        vet3.setId(3L);

        vetService.save(vet3);

        System.out.println("Loaded Vets");
    }
}
