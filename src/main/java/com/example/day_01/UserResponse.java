package com.example.day_01;

public class UserResponse{
    private String first_name;
    private int id;
    private String email;
    private int age;

    public void setFirst_Name(String name){
        this.first_name = name;
    }

    public String getFirst_Name(){
        return first_name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return
                "UserResponse{" +
                        "name = '" + first_name + '\'' +
                        ",id = '" + id + '\'' +
                        ",email = '" + email + '\'' +
                        ",age = '" + age + '\'' +
                        "}";
    }
}