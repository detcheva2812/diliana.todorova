package Lecture09OOPPractice;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Diliana", "Female", "Orthodox",
                "Bulgarian", "QA", "Bulgaria", "9112281234", "Bulgaria");

        Person anotherPerson = new Person("Pietro", "Male", "Orthodox",
                "Italian", "Programmer", "Italy", "0745281234", "Italy");

        Person thirdPerson = new Person("Amy", "Female", "Islam",
                "English", "Customer Support", "USA", "9112281234", "USA");

        Bulgarian bulgarian = new Bulgarian("Ivan", "Male", "Orthodox",
                "Bulgarian", "Bank assistant", "Bulgaria", "8712121234", "Bulgaria");

        American american = new American("Susan", "Female", "Catholic",
                "English", "Support specialist", "USA", "8712121234", "Bulgaria");

        Child child = new Child("Marry", "Female", "Catholic",
                "English", null, "USA", "1205212344", "Bulgaria");

        Italian italian = new Italian("Marry", "Female", "Catholic",
                "English", null, "USA", "1205212344", "Bulgaria");


        System.out.println(person);
        System.out.println(anotherPerson);
        System.out.println(thirdPerson);
        System.out.println(bulgarian);
        System.out.println(american);
        System.out.println(child);

        System.out.println();

        person.sayHello();
        anotherPerson.sayHello();
        thirdPerson.sayHello();
        bulgarian.sayHello();
        american.sayHello();
        italian.sayHello();

        System.out.println();

        person.celebrateEaster();
        anotherPerson.celebrateEaster();
        thirdPerson.celebrateEaster();

        System.out.println();

        person.isAdult();
        anotherPerson.isAdult();
        thirdPerson.isAdult();
        child.isAdult();

        System.out.println();

        person.canTakeALoan();
        anotherPerson.canTakeALoan();
        thirdPerson.canTakeALoan();
        child.canTakeALoan();

        System.out.println();

        child.haveFun();

        System.out.println();

        bulgarian.isBornInTheBestCountry();

        System.out.println();

        american.eatsFastFood();

        System.out.println();

        italian.drinksWonderfulCoffee();

    }
}
