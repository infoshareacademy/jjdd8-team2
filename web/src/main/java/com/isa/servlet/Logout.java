package com.isa.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet ("/logout")
public class Logout extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(getClass().getName());


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("googleId");
        logger.info("User logged out");
        response.sendRedirect("/");
    }
}