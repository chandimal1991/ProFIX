package com.nss.profix.fixservice;

import java.util.List;

public interface FIXService {
	
	void init();
	List<String> getSessionList();
	void sendOrder(String sessionId);

}
