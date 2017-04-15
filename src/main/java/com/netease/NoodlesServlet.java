package com.netease;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.netease.Kitchen;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class NoodlesServlet extends HttpServlet {
	public static  Logger m_log = null;
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
		throws ServletException,IOException {
		    PropertyConfigurator.configure("/Library/Tomcat/maven-restaurant/Restaurant/src/main/java/com/netease/log4j.properties"); 
		    PrintWriter writer = response.getWriter();
			String vegetable = request.getParameter("vagetable");
		  String noodles = Kitchen.makeNoodles(vegetable);
		  m_log = Logger.getLogger(noodles); 
		  m_log.debug("debug test...........");
			writer.println(noodles);
			
	}
}