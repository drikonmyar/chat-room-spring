package com.chat.utility;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class UserIdGenerator implements IdentifierGenerator {
	private static int counter = 101;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		int id = counter++;
		LocalDateTime now = LocalDateTime.now();
		String text = "U" + now.getYear() + now.getMonthValue() + now.getDayOfMonth() + now.getHour() + now.getMinute() + now.getSecond();
		return text + id;
	}
}
