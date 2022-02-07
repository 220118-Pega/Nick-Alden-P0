package com.revature.project0.storage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.project0.models.Request;
import com.revature.project0.models.Status;

public class RequestDAO {
	public List<Request> getAllRequests() {
		List<Request> allRequests = new ArrayList<Request>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection())
		{
			String query = "select * from requests";
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				allRequests.add(
						new Request(
								rs.getInt("id"),
								rs.getString("reason"),
								rs.getFloat("amount"),
								Status.valueOf(rs.getString("type"))
								)
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allRequests;
	}
	public Request getRequestById(int id) {
		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "Select * from requests where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return new Request(
						rs.getInt("id"),
						rs.getString("reason"),
						rs.getFloat("amount"),
						Status.valueOf(rs.getString("type"))
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} return null;
	}
	
	public void addRequest(Request newRequest) {
		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String query = "insert into requests (reason, amount, type) values (?,?,CAST(? as Status))";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newRequest.getReason());
			pstmt.setFloat(2, newRequest.getAmount());
			pstmt.setString(3, newRequest.getType().toString());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
