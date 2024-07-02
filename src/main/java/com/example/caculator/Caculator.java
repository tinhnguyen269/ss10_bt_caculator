package com.example.caculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Caculator" , value = "/caculator")
public class Caculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    float firstOperand = Float.parseFloat(req.getParameter("firstOperand"));
    float secondOperand = Float.parseFloat(req.getParameter("secondOperand"));
    String operand = req.getParameter("operator");
    float result = 0;
        switch (operand){
            case "+" :
                result = firstOperand + secondOperand;
                break;
            case "-" :
                result = firstOperand - secondOperand;
                break;
            case "*" :
                result = firstOperand * secondOperand;
                break;
            case "/" :
                if(secondOperand==0){
                    throw new ArithmeticException("Cannot div by zero");
                }
                result = firstOperand / secondOperand;
                break;
        }
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Result: </h1>");
        writer.println(firstOperand + operand + secondOperand + "=" + result);




    }
}
