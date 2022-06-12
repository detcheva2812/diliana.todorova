package Lecture09OOPPractice;

import java.time.LocalDate;

public class Person {

    private String name;
    private String sex;
    private String religion;
    private String language;
    private String job;
    private String nationality;
    private String pin;
    private LocalDate dateOfBirth;
    private int age;
    private String countryOfResidence;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguage() {
        return language;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPin() {
        return pin;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public Person(String name, String sex, String religion, String language, String job, String nationality, String pin, String countryOfResidence) {
        this.name = name;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;

        try {
            if ("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex)) {
                this.sex = sex;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal sex option was entered!");
        }

        try {
            if (pin.length() == 10 && pin.matches("[0-9]+")) {
                this.pin = pin;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal PIN was entered!");
        }
        int yearOfBirth = Integer.parseInt(pin.substring(0, 2));
        int monthOfBirth = Integer.parseInt(pin.substring(2, 4));
        int dayOfBirth = Integer.parseInt(pin.substring(4, 6));

        int checkCentury = Integer.parseInt(pin.substring(2, 3));

        if (checkCentury == 4 || checkCentury == 5) {
            yearOfBirth = Integer.parseInt("20" + pin.substring(0, 2));
            monthOfBirth -= 40;
        } else {
            yearOfBirth = Integer.parseInt("19" + pin.substring(0, 2));
        }

        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.age = LocalDate.now().getYear() - yearOfBirth;
    }

    public void sayHello() {
        String hello;

        switch (getLanguage()) {
            case "Bulgarian":
                hello = "Здравей";
                break;
            case "Italian":
                hello = "Ciao";
                break;
            default:
                hello = "Hello";
        }
        System.out.printf("%s, my name is %s.%n", hello, getName());
    }

    public boolean celebrateEaster() {
        if ("orthodox".equalsIgnoreCase(getReligion()) || "catholic".equalsIgnoreCase(getReligion())) {
            System.out.printf("%s celebrates Easter.%n", getName());
            return true;
        } else {
            System.out.printf("%s does not celebrate Easter.%n", getName());
            return false;
        }
    }

    public boolean isAdult() {
        if ("USA".equalsIgnoreCase(getCountryOfResidence())) {
            if (getAge() >= 21) {
                System.out.printf("%s is Adult.%n", getName());
                return true;
            } else {
                System.out.printf("%s is not Adult.%n", getName());
                return false;
            }
        } else {
            if (getAge() >= 18) {
                System.out.printf("%s is Adult.%n", getName());
                return true;
            } else {
                System.out.printf("%s is not Adult.%n", getName());
                return false;
            }
        }
    }

    public boolean canTakeALoan() {
        if (isAdult() && getJob() != null) {
            System.out.printf("%s can take a loan.%n", getName());
            return true;
        } else {
            System.out.printf("%s can't take a loan.%n", getName());
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", language='" + language + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", pin='" + pin + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
}


