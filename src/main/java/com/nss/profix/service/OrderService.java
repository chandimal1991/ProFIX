package com.nss.profix.service;

import com.nss.profix.resources.ServletContextClass;

import simplefix.Engine;
import simplefix.EngineFactory;
import simplefix.Message;
import simplefix.MsgType;
import simplefix.Session;
import simplefix.Tag;

public class OrderService {

	public Engine _engine = ServletContextClass._engine;
	public EngineFactory _engineFact = ServletContextClass._engineFact;


	public void sendOrder(String sessionId) throws IllegalArgumentException {

		try {

			for (Session session : _engine.getAllSessions()) {

				if (sessionId.equals(session.getSenderCompID() + "<-->" + session.getTargetCompID())) {

					if (quickfix.Session.lookupSession(session.getSenderCompID(), session.getTargetCompID())
							.isLoggedOn()) {

						Message ordMsg = _engineFact.createMessage(MsgType.ORDER_SINGLE);

						ordMsg.setValue(Tag.ClOrdID, "Cld-1234");
						ordMsg.setValue(Tag.Symbol, "6758");
						ordMsg.setValue(Tag.Side, "1");
						ordMsg.setValue(Tag.OrderQty, "1000");
						ordMsg.setValue(Tag.Price, "123.45");
						ordMsg.setValue(Tag.OrdType, "2");
						ordMsg.setValue(Tag.HandlInst, "3");
						ordMsg.setValue(Tag.TransactTime, "20200508-04:36:42");

						session.sendAppMessage(ordMsg);

						System.out.println("Executing sendOrder function==>" + sessionId);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
