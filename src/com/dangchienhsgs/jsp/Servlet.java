package com.dangchienhsgs.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by dangchienbn on 14/11/2014.
 */
@WebServlet(name = "Servlet")

public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //int K=Integer.parseInt(request.getParameter("num_ad_cluster"));
        //int L=Integer.parseInt(request.getParameter("num_app_cluster"));

        new AmobiCluster().executeICCA();
    }
}
