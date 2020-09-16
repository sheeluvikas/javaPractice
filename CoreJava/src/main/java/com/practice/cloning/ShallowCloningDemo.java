package com.practice.cloning;

/**
 * The clone() method of the Object class creates a new instance
 * and copies all fields of the Cloneable object
 * to that new instance (either it is primitive or a reference)
 *
 */
public class ShallowCloningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        /**
         * Shallow cloning is the default one.
         *
         * */
        com.practice.cloning.Person person = new Person();
        City city = new City("Kanpur", 208022L);


        person.setCity(city);

        Person person1 = person.clone();

        System.out.println(person1 == person); /** the objects are not equal*/
        System.out.println(person1.equals(person)); /** The equals method will return true as the objects have same values*/

        System.out.println(person.getCity() == person1.getCity()); /** The city is reference in the Person class, and
         since its a Shallow cloning, the references will not be cloned and hence will return true !!! */


    }
}
