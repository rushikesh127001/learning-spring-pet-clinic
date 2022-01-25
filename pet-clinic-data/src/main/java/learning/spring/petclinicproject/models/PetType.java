package learning.spring.petclinicproject.models;

public class PetType extends BaseEntity{
    private String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
