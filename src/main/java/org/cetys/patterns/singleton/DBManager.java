package org.cetys.patterns.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by edwin on Apr, 2020
 */
public final class DBManager {

    private final String connectionString = "Server=myServerAddress;Database=myDataBase;Uid=myUsername;Pwd=myPassword;";
    private final Map<String, List<String>> data;

    // --------------Singleton core--------------
    private static DBManager uniqueInstance;

    private DBManager() {
        data = new HashMap<>();
    }

    public static DBManager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DBManager();
        }
        return uniqueInstance;
    }
    // ------------------------------------------

    public void insert(String table, String value) {
        data.putIfAbsent(table, new ArrayList<>());
        data.get(table).add(value);
    }

    public String[] select(String table) {
        return data.getOrDefault(table, List.of()).toArray(new String[0]);
    }
}
