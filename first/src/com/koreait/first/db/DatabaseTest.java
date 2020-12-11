package com.koreait.first.db;

import java.sql.Connection;

public class DatabaseTest {

	public static void main(String[] args) {
		Connection con = DbUtils.getCon();
		
		DbUtils.close(con);

	}

}
