package az.edu.turing.module03.lesson34.console;

import az.edu.turing.module03.lesson34.controller.StudentController;
import az.edu.turing.module03.lesson34.dao.StudentDao;
import az.edu.turing.module03.lesson34.dao.impl.StudentDaoImpl;
import az.edu.turing.module03.lesson34.service.StudentService;
import az.edu.turing.module03.lesson34.service.impl.StudentServiceImpl;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class CourseConsole {
    static final StudentDao studentDao = new StudentDaoImpl();
    static final StudentService studentService = new StudentServiceImpl(studentDao);
    static final StudentController studentController = new StudentController(studentService);

    public static void run() throws Exception {
        Server server = new Server(8081);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        context.addServlet(new ServletHolder(studentController), "/students/*");
        server.setHandler(context);
        server.start();
        System.out.println("Server started at http://localhost:8081");
        server.join();
    }
}
