package com.github;

public class Employee {
    private String FIO;
    private String Post;
    private String Email;
    private String PhoneNumber;
    private long Salary;
    private int Age;

    public Employee(String FIO, String Post, String Email, String PhoneNumber, long Salary, int Age){
        this.FIO = FIO;
        this.Post = Post;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public void out(){
        System.out.print(this.FIO+" "+this.Post+" "+this.Email+" "
                          +this.PhoneNumber+" "+this.Salary+"руб "+this.Age+"лет");

    }

    public int getAge(){
        return this.Age;
    }

    public boolean getIsRetired(){
        if(this.Age > 65) {return true;}
        else {return false;}
    }
}
