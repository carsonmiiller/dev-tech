/**
 * EntityThis is an entity mapped to a preexisting mySQL table called This.
 *
 * EntityThis supports CRUD operations via the JDBC library objects and methods:
 *   Connection.createStatement; Statement.executeQuery.
 *
 * @author Scott Swanson
 * @version 2023.04.01
*/
public class EntityThis {
    // Is this really the right way to embed the table information?
    // Should it be hard-coded? If not, then ... what?
    // People will argue about such things
      private static final String dbTableName = "This";
      private static final String primaryKeyColumnName = "This_pk";
      private static final int primaryKeyColumnIdx = 1;
    
    // The proper handling of enumerated types between Java and MySQL
    // is also a matter of some debate.
      enum JKLValues {
        X,
        Y,
        Z
      }
      
      // these member fields map directly to the This DB table columns
      // with the same names, but prefixed with "This_" -- e.g., This_pk.
      private int pk;
      private String abc;
      private int def;
      private java.util.Date ghi;
      private JKLValues jkl;
    
    
    // To keep this example simple, ALL instances of EntityThis will share the
    //   the same JDBCConnector. This is a problem if you want your program
    //   to be able to access different databases for different EntityThis objects.
    //   There are solutions, but they are complicated distractions from the
    //   objectives of this assignment.
      private static JDBCConnectionMaker dbConnectionMaker;
    
    /**
     * Provides protected access to the name of the column containing the Primary Key.
     * @return the name of the column containing the Primary Key
    */
      protected String primaryKeyColumnName() {
      };
    
    /**
     * Provides protected access to the index of the column containing the Primary Key.
     * @return the index of the column containing the Primary Key
    */
      protected int primaryKeyColumnIndex() {
      }
    
    /**
     * Provides protected access to the value of the Primary Key
     * @return the integer value corresponding to the Primary Key
    */
      protected int primaryKey() {
      }
    
    /**
     * Copies values from a JDBC ResultSet object into the
     *   EntityThis internal data structures.
     * Does NOT set the primary key
     * @param resSet   ResultSet of a Select * on the This table.
     *             Precondition: the ResultSet iterator *must* point at a valid row.
     *               i.e., resSet.next() must have been called, and must
     *                 have returned true.
     * @return true
     */
      protected boolean populateFromResultSet(ResultSet resSet) {
    // iterate over the fields of the resSet, picking up each database value by its name
    //   and then putting it down with the appropriate public Setter.
      }
    
    /**
     * Inserts a single record into the This db table, populating it with the values
     *   stored in the current object instance.
     * Precondition: the dbConnectionMaker must have been set
     * @return true IFF the record was successfully inserted into the DB
    */
      protected boolean create() {
    // assume success -- set result = true
    // build a SQL Insert statement string
    // get a Connection object from the dbConnectionMaker
    // get a Statement object from the Connection
    // execute the insert statement via the Statement object
    // get from the Statement the primary key that was generated
    //   and store it as the primary key value of this object instance
    // if the insert threw an exception, set result = false
    // return result
      }
    
    /**
     * Reads a single record from the sql table, and populates this object instance with
     *   the values returned. read populates ONLY those fields contained in one row of
     *   the table mapped by the JDBCEntity subclass. It does NOT "drill" recursively
     *   into other sql records with related Foreign Keys. EVER.
     * Precondition: the dbConnector must have been set
     * @param primaryKey    the value of the primary key field for the target row.
     *                      Precondition: this must be either a valid primary key for
     *                        for an existing row in the DB
     * @return true IFF the record was successfully read from the DB and the object instance
     *                      was successfully populated.
    */
      protected boolean read (int queryPrimaryKey) {
    // assume success -- set result = true
    // build a SQL Select statement string
    // get a Connection object from the dbConnectionMaker
    // get a Statement object from the Connection
    // execute the Select statement via the Statement object
    // if the select threw an exception, set result = false
    // otherwise:
    //   set the primary key of this object to the queryPrimaryKey
    //   call setDataFromResultSet with resultSet of the Select
    //   set result to whatever is returned by setDataFromResultSet
    // OR if the select threw an exception, set result = false
    // return result
      }
    
    /**
     * Updates a single record of the This db table, populating it with the values
     *   stored in the current object instance.
     * Precondition: the dbConnectionMaker must have been set
     *               the primary key must be a valid key in the table
     * @return true IFF the record was successfully updated into the DB
    */
      protected boolean update() {
    // assume success -- set result = true
    // build a SQL Update statement string
    // get a Connection object from the dbConnectionMaker
    // get a Statement object from the Connection
    // execute the update statement via the Statement object
    // if the update throws an exception, set result = false
    // return result
      }
    
    /**
     * Deletes a single record from the This db table, corresponding to the
     *   primary key value of the current object instance
     * Precondition: the dbConnectionMaker must have been set
     *               the primary key must be a valid key in the table
     * @return true IFF the record was successfully deleted from the DB
    */
      protected boolean delete () {
    // assume success -- set result = true
    // build a SQL Delete statement string
    // get a Connection object from the dbConnectionMaker
    // get a Statement object from the Connection
    // execute the delete statement via the Statement object
    // if the delete throws an exception, set result = false
    // return result
      }
    
    /**
     * Either inserts or updates a single record of the This db table, depending on
     *   whether the primary key of the current object instance has been set.
     * Precondition: the dbConnectionMaker must have been set
     *               the primary key must be a valid key in the table, or 0
     * @return true IFF the record was successfully inserted/updated into the DB
    */
      public boolean save() {
    // assume failure, set result = false
    // if the current primary key is 0, call create
    // if the current primary key is not 0, call update
    // set the result to whatever was returned by the create/update call
    // return the result
      };
    
    /**
     * Reads a single record of the This db table
     * Precondition: the dbConnectionMaker must have been set
     * @param queryPrimaryKey primary key of the desired record
     * @return true IFF the record was successfully read from the DB
     *                  and the current object instance successfully
     *                  populated with the returned values
    */
      public boolean load (int queryPrimaryKey) {
    // assume failure, set result = false
    // call read() with the queryPrimaryKey
    // set result to whatever was returned by read()
    // return result
      };
    
    /**
     * Deletes the record of the This db table corresponding to the current object instance
     * Precondition: the dbConnectionMaker must have been set
     * @return true IFF the record was successfully deleted
     */
      public boolean remove () {
    // assume failure, set result = false
    // if the primary key is > 0
    //   call delete()
    //   set result to whatever was returned by delete()
    // return result
      };
    
    /**
     * Setter for the static dbConnectionMaker object member field
     * Precondition: the dbConnectionMaker should be a valid JDBConnectionMaker instance
     * @return void
     */
      public void setDbConnector ( JDBCConnectionMaker dbConnectionMaker_new  ) {
        dbConnectionMaker = dbConnectionMaker_new;
      }
    
    /**
     * Setter for This_abc table field
     * @param abc_new
     * @return void
     */
      public void setAbc (String abc_new){
      }
    
    /**
     * Setter for This_abc table field
     * @param def_new
     * @return void
     */
      public void setDef (int def_new){
      }
    
    /**
     * Setter for This_abc table field
     * @param ghi_new
     * @return void
     */
      public void setGhi (java.util.Date ghi_new){
      }
    
    /**
     * Setter for This_abc table field
     * @param jkl_new
     * @return void
     */
      public void setJkl (JKLValues jkl_new){
      }
    
    /**
     * Getter for This_abc table field
     * @return current value of abc in this object instance
     */
      public String getAbc (){
      }
    
    /**
     * Getter for This_abc table field
     * @return current value of def in this object instance
     */
      public int getDef (){
      }
    
    /**
     * Getter for This_abc table field
     * @return current value of ghi in this object instance
     */
      public java.util.Date getGhi (){
      }
    
    /**
     * Getter for This_abc table field
     * @return current value of jkl in this object instance
     */
      public JKLValues getJkl (){
      }
      
    /**
     * Constructor creates an empty EntityThis object
     * @return  a valid EntityThis object that does not map to a record in the DB
     */
      public EntityThis (
      ) {
      }
    
    /**
     * Constructor creates an EntityThis object, and attempts to load a record from the DB
     * @return IFF the queryPrimaryKey is valid, an EntityThis object populated with the
     *         corresponding values for that record.
     *         otherwise, returns a valid but empty EntityThis object
     */
      public EntityThis (int queryPrimaryKey) {
        this.load(queryPrimaryKey);
      }
    }