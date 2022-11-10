import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University uni1 = new University();
        uni1.setName("Arabaev!");
        uni1.setFaculty("IST!");

        University uni2 = new University();
        uni2.setName("JAGU!");
        uni2.setFaculty("Filologia!");

        University uni3 = new University();
        uni3.setName("OSHMU!");
        uni3.setFaculty("EKONOMI!");


        School sch1 = new School();
        sch1.setName("Rahmanjan!");
        sch1.setNumber((byte) 13);

        School sch2 = new School();
        sch2.setName("Orozbaev!");
        sch2.setNumber((byte) 7);

        School sch3 = new School();
        sch3.setName("Isanov!");
        sch3.setNumber((byte) 16);
        Car car1 = new Car();
        car1.setBrand("Mers!");
        car1.setColour("Black!");

        Car car2 = new Car();
        car2.setBrand("BMW!");
        car2.setColour("White!");

        Car car3 = new Car();
        car3.setBrand("Tiko!");
        car3.setColour("Red!");

        Person pr1 = new Person();
        ;
        pr1.setName("Madina!");
        pr1.setAge(17);

        Person pr2 = new Person();
        ;
        pr2.setName("Perizat!");
        pr2.setAge(18);

        Person pr3 = new Person();
        ;
        pr3.setName("Aybiyke!");
        pr3.setAge(10);

        University[] arrayUni = {uni1, uni2, uni3};
        for (University i:arrayUni) {
            System.out.println("Name is: "+i.getName()+" Faculty is: "+i.getFaculty());
        }
        School[] arraySchool = {sch1, sch2, sch3};
        for (School i:arraySchool) {
            System.out.println("Name is: "+i.getName()+" Number is: "+i.getNumber());
        }
        Car[] arrayCar = {car1, car2, car3};
        for (Car i:arrayCar) {
            System.out.println("Brand is: "+i.getBrand()+" Colour is: "+i.getColour());
        }
        Person[] arrayPerson = {pr1, pr2, pr3};
        for (Person i:arrayPerson) {
            System.out.println("Name is: "+i.getName()+" Age is: "+i.getAge());
        }
    }
}