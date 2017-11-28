package com.matic.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//通过urlConnection去调用远程的服务
		//1.创建URL的地址
		URL url = new URL("http://10.83.33.106:8088/WebService/TheService");
		//2.打开连接
		URLConnection connection = url.openConnection();
		//3.转换HttpURLConnection
		HttpURLConnection httpConnection = (HttpURLConnection)connection;
		//4.打开输入和输出的开关
		httpConnection.setDoInput(true);
		httpConnection.setDoOutput(true);
		//5.设置请求方式
		httpConnection.setRequestMethod("POST");
		httpConnection.setRequestProperty("Content-Type","text/xml;charset=UTF-8");
		//6.拼接请求消息
		String data = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ser=\"http://service.matic.com/\">"
		   + "<soapenv:Header/>"
		   + "<soapenv:Body>"
		      + "<ser:Hello>"
		        + "<arg0>123</arg0>"
		     + "</ser:Hello>"
		  + "</soapenv:Body>"
		+"</soapenv:Envelope>";	
		//7.获得输出流
		OutputStream outputStream = httpConnection.getOutputStream();
		//8.发送数据
		outputStream.write(data.getBytes());
		//9.判断请求成功
		if(httpConnection.getResponseCode() == 200){
			//10.获得输入流
			InputStream inputStream = httpConnection.getInputStream();
			//11.使用输入流的缓冲区
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuffer sb = new StringBuffer();
			String line = null;
			while((line = reader.readLine()) != null){
				sb.append(line);
			}
			System.out.println(sb.toString());
		}else{
			System.out.println("error!!!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
