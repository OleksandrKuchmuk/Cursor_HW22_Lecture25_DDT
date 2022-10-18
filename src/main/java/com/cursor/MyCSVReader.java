package com.cursor;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCSVReader {

    public static final String PATH_TO_CSV_FILE = "src/main/resources/testFile.csv";

    public Iterator<Object[]> readFromCsv() {
        List<Object[]> testLines = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(PATH_TO_CSV_FILE))) {
            List<String[]> readLines = reader.readAll();
            testLines.addAll(readLines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            e.printStackTrace();
        }
        return testLines.iterator();
    }
}