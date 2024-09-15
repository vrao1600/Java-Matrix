package GenericsPractice;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void testDefaultCase() {
        String s = "dhruv";
        int rows = s.length();
        int columns = s.length();

        Matrix<String> m = new Matrix<String>(rows, columns);

        int r = 0;
        int c = 0;
        // add letters of s diagonally
        for (int i = 0; i < s.length(); i++) {
            m.put(r, c, s.substring(i, i + 1));
            r++;
            if (r >= rows)
                r = 0;
            c++;
            if (c >= columns)
                c = 0;
        }

        // make string representing matrix content
        String t = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (m.get(i, j) == null)
                    t += ".";
                else
                    t += m.get(i, j);
            }
            t += "\n";
        }

        assertEquals("Matrix content does not match the expected output after diagonal population", 
                     "d....\n.h...\n..r..\n...u.\n....v\n", t);
    }
}