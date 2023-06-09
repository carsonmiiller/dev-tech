import java.sql.*;

/**
 * This class maps to the This table in the database from DevTech 1.
 * It is used to carry out the basic CRUD operations on a single instance
 * from the table.
 * @author:  Carson Miller and Keegan Johnson
 * @version: 2023.03.24
 */
public class EntityThis{
    private enum This_jkl {
        x, y, z;
    }
    private int primaryKey;
    private String This_abc;
    private int This_def;
    private java.sql.Date This_ghi;
    private This_jkl This_jkl;

    private static JDBCConnectionMaker dbCxnMaker;
    

    /**
     * This is an empty constructor for the EntityThis class.
     * It is used to create an instance of the class without initializing
     * any of the instance variables. This constructor is called when creating
     * a new instance of the class to be inserted into the database.
     * @return an instance of the EntityThis class
     */
    public EntityThis(){
        // validate existence of dbcxnmaker

        // creating an empty entityThis instance

        // return EntityThis
    }

    /**
     * This is a constructor for the EntityThis class.
     * It is used to create an instance of the class and initialize
     * the instance variables with the values that correspond to the
     * instance in the This table with the given primary key value.
     * @param primaryKey
     * @return an instance of the EntityThis class
     */
    public EntityThis(int primaryKey){
        // validate existence of dbcxnmaker

        // use primary key to access exisiing row in table 
        
        // use to set values of instance vars

        //return EntityThis
    }

    // Getters and Setters
    public String getThis_abc(){return This_abc;}
    public void setThis_abc(String This_abc){this.This_abc = This_abc;}

    public int getThis_def(){return This_def;}
    public void setThis_def(int This_def){this.This_def = This_def;}

    public java.sql.Date getThis_ghi(){return This_ghi;}
    public void setThis_ghi(java.sql.Date This_ghi){this.This_ghi = This_ghi;}

    public This_jkl getThis_jkl(){return This_jkl;}
    public void setThis_jkl(This_jkl This_jkl){this.This_jkl = This_jkl;}

    public static void setDbCxnMaker(JDBCConnectionMaker newDbCxnMaker){
        dbCxnMaker = newDbCxnMaker;
    }

    /**
     * This method executes an INSERT INTO statement on the This table.
     * It creates a new record in the table.
     * It could be called by the save() method.
     */
    private void create(){
        // use JDBC Connection to initialize Statement object
        
        // execute INSERT INTO query on Statement object using instance variables
    }
    
    /**
     * This method executes a SELECT statement on the This table.
     * It selects all columns for a particular primary key value.
     * It is called by the load() method.
     * @param:  primaryKey - the primary key value of the record to be read
     */
    private void read(int primaryKey){
        // use JDBC Connection to initialize Statement object
        
        // execute SELECT query on Statement object using primary key variable
        
        // set instance variables to results from query
    }
    
    /**
     * This method executes an UPDATE statement on the This table.
     * It updates the table with the values of the instance variables
     * in this EntityThis object.
     * It could be called by the save() method.
     */
    private void update(){
        // use JDBC Connection to initialize Statement object
        
        // execute UPDATE query on Statement object using instance variables
    }
    
    /**
     * This method executes a DELETE statement on the This table.
     * It deletes the record for this instance of the EntityThis class.
     * It is called by the remove() method.
     */
    private void delete(){
        // use JDBC Connection to initialize Statement object
        
        // execute DELETE query on Statement object using instance's primary key
    }

    /**
     * This method calls create() or update(), whichever is appropriate.
     * create() is called if the primaryKey value does not exist in the This table
     * update() is called if the primaryKey value exists in the This table
     */
    public void save(){
        // validate existence of primary key in table

        // if exists, call update()

        // if does not exist, call create()
    }

    /**
     * This method calls read() to "pick up" the record for a particular primary key value.
     * @param:  primaryKey - the primary key value of the record to be read
     */
    public void load(int primaryKey){
        // call read() to pick up the record corresponding to primary key
    }

    /**
     * This method calls delete().
     * It removes the record for this instance of the EntityThis class from the This table
     */
    public void remove(){
        // call delete() to remove record for this instance of the table
    }
}

/**
 * This class maps to the That table in the database from DevTech 1.
 * It is used to carry out the basic CRUD operations on a single instance
 * from the table.
 * @author:  Carson Miller and Keegan Johnson
 * @version: 2023.03.27
 */
public class EntityThat{
    private int That_pk;
    private String That_mno;
    private String That_pqr;
    private int That_this_pk;

    private static JDBCConnectionMaker dbCxnMaker;
    

    /**
     * This is an empty constructor for the EntityThat class.
     * It is used to create an instance of the class without initializing
     * any of the instance variables. This constructor is called when creating
     * a new instance of the class to be inserted into the database.
     * @return an instance of the EntityThat class
     */
    public EntityThat(){
        // validate existence of dbcxnmaker

        // creating an empty EntityThat instance

        // return EntityThat
    }

    /**
     * This is a constructor for the EntityThat class.
     * It is used to create an instance of the class and initialize
     * the instance variables with the values that correspond to the
     * instance in the That table with the given primary key value.
     * @param That_pk
     * @return an instance of the EntityThat class
     */
    public EntityThat(int That_pk){
        // validate existence of dbcxnmaker

        // use primary key to access existing row in table 
        
        // use to set values of instance vars

        // return EntityThat
    }

    // Getters and Setters
    public String getThat_mno(){return That_mno;}
    public void setThat_mno(String That_mno){this.That_mno = That_mno;}

    public String getThat_pqr(){return That_pqr;}
    public void setThat_pqr(String That_pqr){this.That_pqr = That_pqr;}

    public int getThat_this_pk(){return That_this_pk;}
    public void setThat_this_pk(int That_this_pk){this.That_this_pk = That_this_pk;}


    public static void setDbCxnMaker(JDBCConnectionMaker newDbCxnMaker){
        dbCxnMaker = newDbCxnMaker;
    }

    /**
     * This method executes an INSERT INTO statement on the That table.
     * It creates a new record in the table.
     * It could be called by the save() method.
     */
    private void create(){
        // use JDBC Connection to initialize Statement object
        
        // execute INSERT INTO query on Statement object using instance variables
    }
    
    /**
     * This method executes a SELECT statement on the That table.
     * It selects all columns for a particular primary key value.
     * It is called by the load() method.
     * @param:  That_pk - the primary key value of the record to be read
     */
    private void read(int That_pk){
        // use JDBC Connection to initialize Statement object
        
        // execute SELECT query on Statement object using primary key variable
        
        // set instance variables to results from query
    }
    
    /**
     * This method executes an UPDATE statement on the That table.
     * It updates the table with the values of the instance variables
     * in this EntityThat object.
     * It could be called by the save() method.
     */
    private void update(){
        // use JDBC Connection to initialize Statement object
        
        // execute UPDATE query on Statement object using instance variables
    }
    
    /**
     * This method executes a DELETE statement on the That table.
     * It deletes the record for this instance of the EntityThat class.
     * It is called by the remove() method.
     */
    private void delete(){
        // use JDBC Connection to initialize Statement object
        
        // execute DELETE query on Statement object using instance's primary key
    }

    /**
     * This method calls create() or update(), whichever is appropriate.
     * create() is called if the That_pk value does not exist in the That table
     * update() is called if the That_pk value exists in the That table
     */
    public void save(){
        // validate existence of primary key in table

        // if exists, call update()

        // if does not exist, call create()
    }

    /**
     * This method calls read() to "pick up" the record for a particular primary key value.
     * @param:  That_pk - the primary key value of the record to be read
     */
    public void load(int That_pk){
        // call read() to pick up the record corresponding to primary key
    }

    /**
     * This method calls delete().
     * It removes the record for this instance of the EntityThat class from the This table
     */
    public void remove(){
        // call delete() to remove record for this instance of the table
    }
}