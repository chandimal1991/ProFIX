package com.nss.profix.fixservice;

import java.util.ArrayList;
import java.util.List;

import com.nss.profix.model.Session;

public interface FIXService {
	
	void init();
	List<String> getSessionList();
	ArrayList<Session> getSessions();
	void sendOrder(String sessionId);

}
