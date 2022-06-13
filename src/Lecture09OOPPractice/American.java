package Lecture09OOPPractice;

public class American extends Person {

    public American(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "English", job, "American", pin, countryOfResidence);
    }

    public void eatsFastFood() {
        System.out.printf("%s is American and eats fast food.%n", getName());
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello, my name is %s.%n", getName());
    }
}


