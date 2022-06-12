package Lecture09OOPPractice;

public class Child extends Person {

    public Child(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, language, null, nationality, pin, countryOfResidence);
    }

    @Override
    public boolean isAdult(){
        System.out.printf("%s is a child.%n", getName());
        return false;
    }
    @Override
    public boolean canTakeALoan(){
        System.out.printf("%s is a child and cannot take a loan.%n", getName());
        return false;
    }

    public void haveFun(){
        System.out.printf("%s is a child and is having fun.%n", getName());
    }

}
