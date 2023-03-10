package zoologico.modelos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author  Julian A. Rodríguez G. - Oscar Albeiro Blandón
 * @version 0.0.1
 * Esta clase representa la estructura y carcaterística general de los animales pertenecientes
 * al zoológico. De esta se extenderá las demás clases de los tipos específicos de animales en el zoológico.
 */
public class Animal {
    private String id, scientificName, species;
    private LocalDate birthDate;
    private long age;

    public Animal() {
    }

    public Animal(String id, String scientificName, String species, LocalDate birthDate) {
        this.id = id;
        this.scientificName = scientificName;
        this.species = species;
        this.birthDate = birthDate;
        this.age = ChronoUnit.YEARS.between(LocalDate.now(), birthDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String eat () {
        return "El animal se encuentra comiendo actualmente!";
    }

    public String drinkingWater(){
        return "Ahora el animal se encuentra bebiendo agua!";
    }

    public String sleep(){
        return "Silecio. Animal durmiendo!";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", species='" + species + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                '}';
    }

}
