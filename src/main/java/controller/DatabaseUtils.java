package controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseUtils {
    public static void executeSQL(SQLConsumer<PreparedStatement> consumer, String query, Connection con) {
        try (PreparedStatement ptsm = con.prepareStatement(query)) {
            consumer.accept(ptsm);
            int rowsAffected = ptsm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Successfully!");
            } else {
                System.out.println("Failded!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuery(SQLConsumer<PreparedStatement> consumer, String query, Connection con) {
        try {
            PreparedStatement ptsm = con.prepareStatement(query);
            consumer.accept(ptsm);
            return ptsm.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

