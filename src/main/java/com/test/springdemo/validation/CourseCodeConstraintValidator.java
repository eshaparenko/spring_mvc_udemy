package com.test.springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>
{

    private String coursePrefixes;

    @Override
    public void initialize(CourseCode courseCode)
    {
        coursePrefixes = courseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext)
    {
        boolean result = false;

        if (theCode != null) {

                result = theCode.startsWith(coursePrefixes);


        } else {
            result = true;
        }
        return result;
    }
}
