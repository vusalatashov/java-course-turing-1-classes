package az.edu.turing.module03.lesson34.query;

public class StudentSqlQuery {
    public static final String SELECT_ALL_STUDENTS = "SELECT * FROM STUDENTS";
    public static final String INSERT_STUDENT = "INSERT INTO STUDENTS (NAME, SURNAME, AGE , GPA) VALUES (?, ?, ?, ?)";
    public static final String DELETE_STUDENT = "DELETE FROM STUDENTS WHERE ID = ?";
    public static final String UPDATE_STUDENT = "UPDATE STUDENTS SET NAME = ?, SURNAME = ?, AGE = ?, GPA = ? WHERE ID = ?";
    public static final String SELECT_STUDENT_BY_ID = "SELECT * FROM STUDENTS WHERE ID = ?";
    public static final String UPDATE_STUDENT_NAME_BY_ID = "UPDATE STUDENTS SET NAME = ? WHERE ID = ?";
}
