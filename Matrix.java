package GenericsPractice;

import java.util.ArrayList;

/**
 * A generic Matrix class that represents a two-dimensional array of elements.
 *
 * @param <T> the type of elements in this matrix
 */
public class Matrix<T> {
    /**
     * The number of rows in the matrix.
     */
    private int rows;
    /**
     * The number of columns in the matrix.
     */
    private int columns;
    /**
     * The elements of the matrix stored as an ArrayList of ArrayLists.
     */
    private ArrayList<ArrayList<T>> elements;
    /**
     * Constructs a Matrix with the specified number of rows and columns.
     * All elements are initially set to {@code null}.
     *
     * @param rows    the number of rows in the matrix
     * @param columns the number of columns in the matrix
     */

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new ArrayList<ArrayList<T>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<T> row = new ArrayList<T>();
            for (int j = 0; j < columns; j++) {
                row.add(null);
            }
            elements.add(row);
        }
    }

    // Getter method
    /**
     * Returns the element at the specified position in this matrix.
     *
     * @param row    the row index of the element to return
     * @param column the column index of the element to return
     * @return the element at the specified position in this matrix
     * @throws IndexOutOfBoundsException if the row or column index is out of range
     */
    public T get(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return elements.get(row).get(column);
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    // Setter method
    /**
     * Replaces the element at the specified position in this matrix with the specified element.
     *
     * @param row    the row index of the element to replace
     * @param column the column index of the element to replace
     * @param value  the element to be stored at the specified position
     * @throws IndexOutOfBoundsException if the row or column index is out of range
     */
    public void put(int row, int column, T value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            elements.get(row).set(column, value);
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    // Getter for number of rows
    /**
     * Returns the number of rows in this matrix.
     *
     * @return the number of rows in this matrix
     */
    public int getRows() {
        return rows;
    }

    // Getter for number of columns
    /**
     * Returns the number of columns in this matrix.
     *
     * @return the number of columns in this matrix
     */
    public int getColumns() {
        return columns;
    }
}
