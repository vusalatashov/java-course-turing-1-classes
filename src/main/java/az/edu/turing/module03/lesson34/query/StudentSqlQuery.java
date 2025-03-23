package az.edu.turing.module03.lesson34.query;

public class StudentSqlQuery {
    public static final String SELECT_ALL_STUDENTS = "SELECT * FROM STUDENT";
    public static final String SELECT_STUDENT_BY_ID = "SELECT * FROM STUDENT WHERE ID = ?";
    public static final String INSERT_STUDENT = "INSERT INTO STUDENTS (NAME, SURNAME, AGE , GPA) VALUES (?, ?, ?, ?)";
}
