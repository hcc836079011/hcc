package com.AJAX;

import com.bean.Person;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        System.out.println(action);
        if (action.equals("jQueryAjax")){
            Person person = new Person(1, 18, "小明", "男");
            Gson gson = new Gson();
            String jsonStr = gson.toJson(person);
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write(jsonStr);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
