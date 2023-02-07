import java.io.*;
import java.util.*;
public class string1
{
    public static void main(String[] args)
    {
        String[][] students = { {"Brice", "Marvin", "Anna"},
                               {"Kamal", "Maria", "Elissa"} };

    for (int row = 0; row < students.length; row++)
    {
    for (int col = 0; col < students[0].length; col++)
    {
    System.out.print(students[row][col] + " ");
    }
    }
    }
}