package Lecture09OOPPractice;

public class Italian extends Person{

    public Italian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", pin, countryOfResidence);
    }

    public void drinksWonderfulCoffee(){
        System.out.printf("%s is Italian and drinks wonderful coffee.%n", getName());
    }

    @Override
    public void sayHello() {
        System.out.printf("Ciao, my name is %s.%n", getName());
    }
}
