import java.sql.*;
class ThisAndThatJDBC{
    public static void main(String args[]){
        try{
            Connection dbCxn=DriverManager.getConnection(
                "jdbc:mysql://localhost:43306/ThisAndThat", "root", "tatdat4"
            );
            Statement selectThis=dbCxn.createStatement();
            ResultSet rsThis=selectThis.executeQuery("select * from This");
            while(rsThis.next()){
                int foreignKeyToThis = rsThat.getInt(4);
                System.out.println(rsThis.getInt(1)
                            + "  " + rsThis.getString(2)
                            + "  " + rsThis.getString(3)
                            + "  " + rsThis.getInt(4)
                );
                String thisQuery = "select * from This where This_pk = " + foreignKeyToThis + "'";
                System.out.println(thisQuery);
                Statement thisStmt = dbCxn.createStatement();
                ResultSet rsThis = thisStmt.executeQuery(thisQuery);
                while(rsThis.next()){
                    System.out.println("\t" + rsThis.getInt(1)
                            + "  " + rsThis.getString(2)
                            + "  " + rsThis.getInt(3)
                            + "  " + rsThis.getDate(4)
                            + "  " + rsThis.getString(5));
                }
            }
            dbCxn.close();
        }catch(Exception e){ System.out.println(e);}
    }
}