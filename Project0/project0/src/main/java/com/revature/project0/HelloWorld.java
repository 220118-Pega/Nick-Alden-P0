
package com.revature.project0;

import com.revature.project0.models.Request;
import com.revature.project0.storage.RequestDAO;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
//    Javalin app = Javalin.create().start(7000);
//    app.get("/", ctx -> ctx.result("Hello World"));
    
    RequestDAO requestDAO = new RequestDAO();
    for(Request request:requestDAO.getAllRequests())
    {
    	System.out.println(request);
    }
  }
}
