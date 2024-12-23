package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1. 개 병원에 고양이 전달
//        dogHospital.set(cat); // 컴파일 오류 발생

        // 문제2. 개 타입 반환
        dogHospital.set(dog);
        // 다운 캐스팅 필요없음
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이", 300));
        System.out.println("biggerDog = " + biggerDog);
    }
}