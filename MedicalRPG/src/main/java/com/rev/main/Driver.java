package com.rev.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rev.beans.Player;
import com.rev.dao.PlayerDao;
import com.rev.daoimpl.PlayerDaoImpl;
import com.rev.hibernate.HibernateUtil;

public class Driver {

	static SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
//		Single.instance().Dummy();
		PlayerDao pd = new PlayerDaoImpl();
		// System.out.println(use.getallPlayers());
		System.out.println(pd.getPlayerByID(10200));
//		funWithSessions(sf);
	}

	static void funWithSessions(SessionFactory sf) {
		Session s = sf.getCurrentSession();
		Transaction tx = s.beginTransaction();
		Player p1 = s.get(Player.class, 33);
		System.out.println(p1);
		Player p2 = s.get(Player.class, 34);
		System.out.println(p2);
		Player p3 = s.load(Player.class, 10360);
		System.out.println(p3);
		System.out.println(s.save(p3)); // adds a new one
		Player p4 = s.get(Player.class, 10360);
		p4.setEmail("Boom.com");
		tx.commit();
		s.close();
	}

}