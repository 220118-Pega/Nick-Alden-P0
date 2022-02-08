
package com.revature.project0;



import com.revature.project0.models.Request;
import com.revature.project0.models.Status;
import com.revature.project0.storage.RequestDAO;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
	RequestDAO requestDAO = new RequestDAO();
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Welcome to the Reimbursement API"));
    app.get("/requests", ctx -> ctx.jsonStream(requestDAO.getAllRequests()));
    app.get("/requests/{request_id}", ctx -> {
    	String stringId = ctx.pathParam("request_id");
    	int id = Integer.parseInt(stringId);
    	Request requestById = requestDAO.getRequestById(id);
    	ctx.jsonStream(requestById);
    });
    app.post("/requests", ctx -> requestDAO.addRequest(ctx.bodyStreamAsClass(Request.class)));
  }
}
