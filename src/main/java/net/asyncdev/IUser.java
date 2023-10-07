package net.asyncdev;

import net.asyncdev.Enums.Gender;

public interface IUser {
    
    public String getName();
    public int getAge();
    public Gender getGender();

    public void setName(String name);
    public void setAge(int age);
    public void setGender(Gender gender);
}
