
package com.revature.project0;



import com.revature.project0.models.Request;
import com.revature.project0.models.Status;
import com.revature.project0.storage.RequestDAO;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
	RequestDAO requestDAO = new RequestDAO();
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello World"));
    app.get("/requests", ctx -> ctx.jsonStream(requestDAO.getAllRequests()));
    app.get("/requests/{request_id}", ctx -> {
    	String stringId = ctx.pathParam("request_id");
    	int id = Integer.parseInt(stringId);
    	Request requestById = requestDAO.getRequestById(id);
    	ctx.jsonStream(requestById);
    });
    requestDAO.addRequest(new Request(0, "office supplies", (float) 14.99, Status.Pending));
  }
}
