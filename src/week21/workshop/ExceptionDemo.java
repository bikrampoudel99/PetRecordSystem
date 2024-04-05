package week21.workshop;

import java.io.IOException;
import java.io.FileNotFoundException;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            divide(0, 0);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    public static void divide(int x, int y) throws IOException
    {
        throw new IOException();
    }

}