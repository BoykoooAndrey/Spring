package org.example;

import org.apache.commons.lang3.builder.*;


public class Person extends ClassLoader
{
    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        builder.append(firstName);
        //builder.append(lastName);
        builder.append(age);
        return builder.toString();
    }

    @Override
    public int hashCode() {
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCodeBuilder.append(firstName);
        hashCodeBuilder.append(lastName);
        return hashCodeBuilder.toHashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person that))
        {
            return false;
        }
        return new EqualsBuilder().append(this.age, that.age).isEquals();
    }

}
