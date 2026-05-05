package project_;

import java.util.Date;

class Customer extends User {
    
    static private int customer_serial = -1;
    
    Customer(String ID, String name, int age, String nationality, String phone) {
         super(ID, name, age, nationality, phone);
         customer_serial++;
         
     }


//     void EditCustomerData(String ID, String name, int age, String gender, String nationality, String phone) {
//         this.ID = ID;
//         Name = name;
//         Age = age;
//         Gender = gender;
//         Nationality = nationality;
//         Phone = phone;
//     }

     void getdetails(){
          System.out.println(this.Age);
         System.out.println(this.ID);
         System.out.println(this.Name);
         System.out.println(this.Nationality);
         System.out.println(this.Phone);



     }

 }
