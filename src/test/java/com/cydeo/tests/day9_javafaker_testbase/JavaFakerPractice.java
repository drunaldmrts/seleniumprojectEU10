package com.cydeo.tests.day9_javafaker_testbase;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        Faker faker=new Faker();
        //Faker faker = new Faker(new Locale("tr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name.lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.letterify(\"????-???\") = " + faker.letterify("??????"));

        System.out.println("faker.bothify(\"???###?#??##\") = " + faker.bothify("???###?#??##"));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris());
    }
}
