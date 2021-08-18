package com.bridgelabs;


import bridgelabs.contactInfo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDBService {
    private static AddressBookDBService addressBookDBService;
    private AddressBookDBService() {
    }

    /**
     * Purpose : For creating a singleton object
     *
     * @return
     */
    public static AddressBookDBService getInstance() {
        if ( addressBookDBService == null)
            addressBookDBService = new AddressBookDBService();
        return addressBookDBService;
    }

    /**
     * Purpose : Create connection with the database
     *
     * @return
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/address_book?useSSL=false";
        String userName = "root";
        String password = "samarth1920";
        Connection connection;
        System.out.println("Connecting to database: "+jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("Connection is successful! " +connection);
        return connection;
    }

    /**
     * Purpose : Create connection to execute query and read the value from the database
     *           Assign the value in a list variable
     *
     * @param sql
     * @return
     */
    private List<contactInfo> getEmployeePayrollDataUsingDB(String sql) {
        List<contactInfo> personInfoList = new ArrayList<>();
        try (Connection connection = this.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                int id = result.getInt("SlNo");
                String type = result.getString("type");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                String address = result.getString("address");
                String city = result.getString("city");
                String state = result.getString("state");
                int zip = result.getInt("zip");
                String phoneNo = result.getString("phonenumber");
                String email = result.getString("emailid");
                personInfoList.add(new contactInfo(id, fname, lname, address, city, state, zip, phoneNo, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personInfoList;
    }

    /**
     * Purpose : Read the person info from the database
     *
     * @return
     */
    public List<contactInfo> readData() {
        String sql = "SELECT * FROM addressbook";
        return getEmployeePayrollDataUsingDB(sql);
    }
}