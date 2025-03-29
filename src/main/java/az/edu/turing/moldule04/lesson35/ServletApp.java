package az.edu.turing.moldule04.lesson35;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import java.io.IOException;

public class ServletApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8083);
        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");


        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");
        context.addServlet(new ServletHolder(new MessageServlet()), "/message");

        server.setHandler(context);
        server.start();
        server.join();
    }

    public static class HelloServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.getWriter().println("salam");
        }
    }

    public static class MessageServlet extends HttpServlet {
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.getWriter().println("ELi's message: " + req.getParameter("message"));
        }

        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.getWriter().println("Fexri's message: " + req.getParameter("message"));
        }
    }
}
