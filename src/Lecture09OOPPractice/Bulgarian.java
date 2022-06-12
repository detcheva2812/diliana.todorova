package Lecture09OOPPractice;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", pin, countryOfResidence);
    }

    public void isBornInTheBestCountry(){
        System.out.printf("%s is Bulgarian and is born in the best country.%n", getName());
    }

    @Override
    public boolean isAdult(){
        if(getAge()>= 18){
            System.out.printf("%s is Adult.%n", getName());
            return true;
        }else{
            System.out.printf("%s is not Adult.%n", getName());
            return false;
        }
    }

    @Override
    public void sayHello() {
        System.out.printf("Здравей, казвам се %s.%n", getName());
    }
}

