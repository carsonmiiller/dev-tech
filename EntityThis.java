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
    

    /**
     * This is an empty constructor for the EntityThis class.
     * It is used to create an instance of the class without initializing
     * any of the instance variables. This constructor is called when creating
     * a new instance of the class to be inserted into the database.
     * @return an instance of the EntityThis class
     */
    public EntityThis(){}

    /**
     * This is a constructor for the EntityThis class.
     * It is used to create an instance of the class and initialize
     * the instance variables with the values that correspond to the
     * instance in the This table with the given primary key value.
     * @param primaryKey
     * @return an instance of the EntityThis class
     */
    public EntityThis(int primaryKey){}

    // Getters and Setters
    public String getThis_abc(){return This_abc;}
    public void setThis_abc(String This_abc){this.This_abc = This_abc;}

    public int getThis_def(){return This_def;}
    public void setThis_def(int This_def){this.This_def = This_def;}

    public java.sql.Date getThis_ghi(){return This_ghi;}
    public void setThis_ghi(java.sql.Date This_ghi){this.This_ghi = This_ghi;}

    public This_jkl getThis_jkl(){return This_jkl;}
    public void setThis_jkl(This_jkl This_jkl){this.This_jkl = This_jkl;}

    /**
     * This method executes an INSERT INTO statement on the This table.
     * It creates a new record in the table.
     * It could be called by the save() method.
     * @return:  true if creation was successful, false otherwise
     */
    private boolean create(){}

    /**
     * This method executes a SELECT statement on the This table.
     * It selects all columns for a particular primary key value.
     * It is called by the load() method.
     * @param:  primaryKey - the primary key value of the record to be read
     * @return:  true if read was successful, false otherwise
     */
    private boolean read(int primaryKey){}

    /**
     * This method executes an UPDATE statement on the This table.
     * It updates the table with the values of the instance variables
     * in this EntityThis object.
     * It could be called by the save() method.
     * @return:  true if update was successful, false otherwise
     */
    private boolean update(){}

    /**
     * This method executes a DELETE statement on the This table.
     * It deletes the record for this instance of the EntityThis class.
     * It is called by the remove() method.
     * @return:  true if deletion was successful, false otherwise
     */
    private boolean delete(){}

    /**
     * This method calls create() or update(), whichever is appropriate.
     * create() is called if the primaryKey value does not exist in the This table
     * update() is called if the primaryKey value exists in the This table
     */
    public void save(){}

    /**
     * This method calls read() to "pick up" the record for a particular primary key value.
     * @param:  primaryKey - the primary key value of the record to be read
     */
    public void load(int primaryKey){}

    /**
     * This method calls delete().
     * It removes the record for this instance of the EntityThis class from the This table
     */
    public void remove(){}
}
