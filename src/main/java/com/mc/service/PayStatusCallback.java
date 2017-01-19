package com.mc.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mc.db.DBUtil;

/**
 * Servlet implementation class PayStatusCallback
 */
public class PayStatusCallback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PayStatusCallback() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String trade_status = request.getParameter("trade_status");
		String out_trade_no = request.getParameter("out_trade_no");
		String trade_no = request.getParameter("trade_no");
		System.out.println("trade_status:" + trade_status);
		DBUtil.insertPayStatus(Integer.parseInt(trade_status), out_trade_no, trade_no);
	}
}
