package com.anders.maizu.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action基类
 * 
 * @author Anders Zhu
 * 
 */
public abstract class BaseAction extends ActionSupport implements SessionAware, RequestAware {

	private static final long serialVersionUID = -2297047811565200272L;

	private Map<String, Object> session;
	private Map<String, Object> request;

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
}
