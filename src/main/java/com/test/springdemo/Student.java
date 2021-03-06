package com.test.springdemo;

import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;

public class Student
{
    @NotNull(message="is required")
    private String firstName;
    @NotNull(message="is required")
    private String lastName;

    private String company;

    private String[] operatingSystems;

    private String sex;

    private String country;

    private String favoriteLanguage;

    @Value("#{countryOptions}")
    private LinkedHashMap<String, String> countryOptions;

    private LinkedHashMap<String, String> sexOptions;

    public Student()
    {
        sexOptions = new LinkedHashMap<String, String>();

        sexOptions.put("male", "Male");
        sexOptions.put("female", "Female");

    }

        public void setOperatingSystems(String[] operatingSystems)
        {
            this.operatingSystems = operatingSystems;
        }

        public String[] getOperatingSystems()
        {

            return operatingSystems;
        }
    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {

        return country;
    }


    public void setFavoriteLanguage(String favoriteLanguage)
    {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage()
    {

        return favoriteLanguage;
    }
    public void setCompany(String country)
    {
        this.company = country;
    }

    public String getCompany()
    {

        return company;
    }

    public LinkedHashMap<String, String> getCountryOptions()
    {
        return countryOptions;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {

        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSex(){return sex;}

    public void setSex(String sex){this.sex = sex;}

    public LinkedHashMap<String, String> getSexOptions(){return sexOptions;}

    public void setSexOptions(LinkedHashMap<String, String> sexOptions){this.sexOptions = sexOptions;}
}
