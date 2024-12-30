package models;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public String getsubject (){
        return subject;
    }
    public void setsubject (String subject){
        this.subject = subject;
    }
    public int getyearsOfExperience(){
        return yearsOfExperience;
    }
    public void setyearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    public void giveRaise(double percentage){
        double raise = salary * (percentage/100);
        salary += raise;
    }
@Override
    public String toString() {
        String genderStr = isGender() ? "Male" : "Female";
        return "Hi, I am " + getName() + " " + getSurname() + ", a " + getAge() + "-years old, " + genderStr + "\n" +
                "I teach " + subject + "\n" +
                "Salary: " + salary + "$";
    }
}
