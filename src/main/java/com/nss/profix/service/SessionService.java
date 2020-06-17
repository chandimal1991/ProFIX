package com.nss.profix.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.nss.profix.resources.ServletContextClass;

import simplefix.Engine;
import simplefix.Session;

public class SessionService {
	
	public Engine _engine = ServletContextClass._engine;

	public List<com.nss.profix.model.Session> getSessions() {

		com.nss.profix.model.Session session1 = new com.nss.profix.model.Session(1, "Test Session 1");
		com.nss.profix.model.Session session2 = new com.nss.profix.model.Session(1, "Test Session 2");
		List<com.nss.profix.model.Session> sessionList = new ArrayList<>();
		sessionList.add(session1);
		sessionList.add(session2);

		return sessionList;

	}
	
	public List<String> getSession() {

		List<String> sessionList = new ArrayList<>();
		sessionList.add("BANZAI44V<-->EXEC44V");
		sessionList.add("BANZAI42<-->EXEC42");
		sessionList.add("BANZAI44<-->EXEC44");
		sessionList.add("BANZAI42V<-->EXEC42V");

		return sessionList;

	}
	
	public ArrayList<String> getSessionList() throws IllegalArgumentException {
    	
		ArrayList<String> sessions = new ArrayList<String>();
		
		for ( Session session : _engine.getAllSessions() ) {
		    sessions.add(session.getSenderCompID() + "<-->" + session.getTargetCompID());
		    System.out.println(session.getSenderCompID() + "<-->" + session.getTargetCompID());
		}
		
		Collections.sort(sessions);
		return sessions;
	    }

}
