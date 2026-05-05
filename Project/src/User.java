package project_;

abstract class User {
    protected String ID ;
    protected String Name ;
    protected int Age ;
    protected String Nationality ;
    protected String Phone;


     User(String ID, String name, int age, String nationality, String phone) {
        this.ID = ID;
        Name = name;
        Age = age;
        Nationality = nationality;
        Phone = phone;
    }
}
