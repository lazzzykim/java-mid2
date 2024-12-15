package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> CatHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> IntegerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> ObjectHospital = new AnimalHospitalV2<>();
    }
}
