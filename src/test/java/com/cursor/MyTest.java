package com.cursor;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTest {

    @DataProvider
    public Object[][] ourData() {
        return new Object[][]{
                {"First-value", 58975},
                {"Second-value", 98},
                {"Third-value", 1}
        };
    }


    @Test(dataProvider = "ourData")
    public void test(String searchWord, int expected) {
        System.out.println(searchWord + " " + expected);
    }

    @Test
    @Parameters({"a", "b"})
    public void test1(int value1, int value2) {
        System.out.println(value1 + value2);
    }
}