/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richedmanegment;

public class User {

    public int id;
    public String fname;
    public String lname;
    public int age;

    public User(int Id, String FName, String LName, int Age) {
        this.id = Id;
        this.fname = FName;
        this.lname = LName;
        this.age = Age;
    }
}
