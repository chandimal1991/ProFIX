package com.nss.profix.service;

import java.util.ArrayList;

import com.nss.profix.resources.ServletContextClass;

import simplefix.Engine;
import simplefix.Session;

public class SessionService {
	
	public Engine _engine = ServletContextClass._engine;

	public ArrayList<com.nss.profix.model.Session> getSessionList() throws IllegalArgumentException {
    	
		ArrayList<com.nss.profix.model.Session> sessions = new ArrayList<com.nss.profix.model.Session>();
		int sessionID = 1;
		
		for ( Session session : _engine.getAllSessions() ) {
			com.nss.profix.model.Session sessionObj = new com.nss.profix.model.Session(sessionID, session.getSenderCompID() + "<-->" + session.getTargetCompID());
		    sessions.add(sessionObj);
		    sessionID++;
		}
		
		return sessions;
	    }

}
