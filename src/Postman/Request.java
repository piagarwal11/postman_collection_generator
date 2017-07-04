package Postman;

import java.util.ArrayList;

public class Request {
	
	String url;
	String method;
	Body body;
	ArrayList<Formdata> header;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public ArrayList<Formdata> getHeader() {
		return header;
	}
	public void setHeader(ArrayList<Formdata> header) {
		this.header = header;
	}
	
	

}
