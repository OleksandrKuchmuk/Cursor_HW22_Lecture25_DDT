package com.cursor;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;

public class CSVTest {

    @DataProvider(name = "dpWithCsv")
    public Iterator<Object[]> csvDataProvider() {
        return new MyCSVReader().readFromCsv();
    }

    @Test(dataProvider = "dpWithCsv")
    public void testWithCsv(String valueA, String valueB) {
        Assert.assertTrue(valueA.contains(valueB));
    }
}