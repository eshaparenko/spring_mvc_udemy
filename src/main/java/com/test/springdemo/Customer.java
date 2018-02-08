package com.test.springdemo;

import com.test.springdemo.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer
{
    private String firstName;


    @NotNull(message="is required")
    @Size(min=3, message="min size is 3")
    private String lastName;

    @NotNull(message="is required")
    @Min(value = 0, message = "must be greater or equal to 0")
    @Max(value = 10, message = "must be less or equal to 10")
    private Integer freePass;

    @Pattern(regexp = "^[a-zA-Z)-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = "TOP", message = "must start with TOP")
    private String courseCode;

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }



    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public Integer getFreePass()
    {
        return freePass;
    }

    public void setFreePass(Integer freePass)
    {
        this.freePass = freePass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
