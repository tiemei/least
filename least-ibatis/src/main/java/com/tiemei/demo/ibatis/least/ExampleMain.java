package com.tiemei.demo.ibatis.least;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.tiemei.demo.ibatis.least.model.User;

public class ExampleMain {

	/**
	 * DB初始化配置
	 */
	private static final String resource = "com/tiemei/demo/ibatis/least/maps/SqlMapConfig.xml";

	/**
	 * 用来执行DB操作的client
	 */
	private static SqlMapClient sqlMap;
	
	// 首先初始化iBatis获得一个SqlMapClient对象
	static {
		try {
			java.io.Reader reader = com.ibatis.common.resources.Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void update() {
		// sqlMap系统初始化完毕，开始执行update操作
		try {
			sqlMap.startTransaction();
			User user = new User();
			user.setId(1);
			user.setName("inser-user-ok");
			user.setSex(1);
			sqlMap.update("insertUser", user);
			sqlMap.commitTransaction();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sqlMap.endTransaction();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static List getUser() {
		List user = null;
		// sqlMap系统初始化完毕，开始执行getAllUser操作
		try {
			sqlMap.startTransaction();
			user = sqlMap.queryForList("getAllUser", null);
			sqlMap.commitTransaction();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				sqlMap.endTransaction();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return user;

	}

	public static void main(String[] args) {
		update();
		List user = getUser();
		for (int i = 0; i < user.size(); i++) {
			System.out.println(((User) user.get(i)).getName());
		}
	}
}
