package com.nss.profix.service;

import java.util.ArrayList;
import java.util.List;

import com.nss.profix.model.Session;

public class SessionService {

	public List<Session> getSessionList() {

		Session session1 = new Session(1, "Test Session 1");
		Session session2 = new Session(1, "Test Session 2");
		List<Session> sessionList = new ArrayList<>();
		sessionList.add(session1);
		sessionList.add(session2);

		return sessionList;

	}

}
