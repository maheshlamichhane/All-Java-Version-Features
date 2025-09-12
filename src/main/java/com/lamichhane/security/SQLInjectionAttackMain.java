package com.lamichhane.security;

public class SQLInjectionAttackMain {

    public void retrieveUsingStatement(String branchCode){
        String selectSQL = "SELECT * FROM APP.BANK_TABLE WHERE BRANCH_CODE="+branchCode+"";
        /*
        BankAccount bankAccount = null;
        try(Statement stmt = con.createStatement()){
            ResultSet rs = stmt.executeQuery(selectSQL);
            while(rs.next()){
                bankAccount = new BankAccount(
                    rs.getString("BRANCH_CODE");
                    rs.getString(2);
                    rs.getString("CUST_NAME");
                    rs.getString("CUST_ADDRESS");
                    rs.getDouble("BALANCE");
            }
           }
           catch(SQLException sqle){
            e.printStackTrace();
           }
                );
         */
    }

    public static void main(String[] args) {
        // bank.retrieveUsingPreparedStatement("123456 OR BRANCH_CODE IS NOT NULL");
    }
}
