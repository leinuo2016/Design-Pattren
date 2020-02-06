package com.leinuo.flyweightPattern;

import java.io.PrintStream;
import java.sql.Connection;

/**
 * Create by leinuo on 2020/2/6 下午12:56
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 *
 * 亨元模式
 */
public class Client {

    public static void main(String[] args) {
        Connection connection =  ConnectionPool.getInstance().getConnection();
        try (
                PrintStream printf = System.out.printf(new StringBuilder().append("connection:").append(connection.getClientInfo().toString()).toString())) {
        }catch (Exception e){}
    }
}
