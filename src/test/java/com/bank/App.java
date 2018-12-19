package com.bank;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class App {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("I'm beforeClass method!");
    }

    @Before
    public void before() {
        System.out.println("I'm before method!");
    }

    @Test
    public void main() {

        System.out.println("Hello World!");

    }

    @After
    public void after() {
        System.out.println("I'm after method!");
    }


}
