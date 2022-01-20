package learning.spring.petclinicproject.bootstrapper;

import learning.spring.petclinicproject.models.Owner;
import learning.spring.petclinicproject.models.Vet;
import learning.spring.petclinicproject.services.OwnerService;
import learning.spring.petclinicproject.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitiliser implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;


    public DataInitiliser(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        //adding ownerss
        Owner owner1=new Owner();
        owner1.setFirstName("Rushi");
        owner1.setLastName("Chaskar");
        owner1.setId(1L);

        Owner owner2=new Owner();
        owner1.setFirstName("Sushi");
        owner1.setLastName("Raskar");
        owner1.setId(2L);

        Owner owner3=new Owner();
        owner1.setFirstName("Pushi");
        owner1.setLastName("khaskar");
        owner1.setId(3L);

        System.out.println("Owners Loaded");

        Vet vet1=new Vet();
        vet1.setFirstName("vetFN1");
        vet1.setLastName("vetLN1");
        vet1.setId(1L);

        Vet vet2=new Vet();
        vet1.setFirstName("vetFN2");
        vet1.setLastName("vetLN2");
        vet1.setId(2L);

        Vet vet3=new Vet();
        vet1.setFirstName("vetFN3");
        vet1.setLastName("vetLN3");
        vet1.setId(3L);

        System.out.println("Loaded Vets");
    }
}
