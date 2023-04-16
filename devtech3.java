import org.junit.jupiter.api.*;
import EntityThis.JKLValues;
import static org.junit.jupiter.api.Assertions.*;

/**
 * EntityThisTest is a test class for EntityThis.
 * 
 * @author Carson Miller and Keegan Johnson
 * @version 2023.04.16
 */
public class EntityThisTest {
    // <function><desired-behavior>when<condition>

    @Test
    public void primaryKeyColumnNameReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        assertEquals("This_pk", entityThis.primaryKeyColumnName());
    }

    @Test
    public void primaryKeyColumnIndexReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        assertEquals(0, entityThis.primaryKeyColumnIndex());
    }

    @Test
    public void primaryKeyReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        entityThis.read(1);
        assertEquals(1, entityThis.primaryKey());
    }

    @Test
    public void createStoresInstanceVariablesInTableWhenCalled(){
        EntityThis entityThis = new EntityThis();
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        boolean createRetVal = entityThis.create();
        if(createRetVal){
            entityThis.read(entityThis.primaryKey());
            assertEquals("abc", entityThis.getAbc());
            assertEquals(25, entityThis.getDef());
            assertEquals(date, entityThis.getGhi());
            assertEquals(jkl, entityThis.getJkl());
        } else {
            fail("create() returned false, the insert statement threw an exception");
        }
    }

    @Test
    public void createThrowsExceptionWhenCalledWithExisitingPK(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        assertFalse(entityThis.create());
    }

    @Test
    public void readInstanceContainsCorrectValuesWhenCalled(){
        EntityThis entityThis = new EntityThis();
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        boolean createRetVal = entityThis.create();
        if(createRetVal){
            entityThis.setAbc("ABC");
            entityThis.setDef(26);
            java.util.Date date2 = new java.util.Date();
            entityThis.setGhi(date2);
            JKLValues jkl2 = JKLValues.Y;
            entityThis.setJkl(jkl2);
            entityThis.read(entityThis.primaryKey());
            assertEquals("abc", entityThis.getAbc());
            assertEquals(25, entityThis.getDef());
            assertEquals(date, entityThis.getGhi());
            assertEquals(jkl, entityThis.getJkl());
        } else {
            fail("create() returned false, the insert statement threw an exception");
        }
    }

    @Test
    public void updateStoresInstanceVariablesInTableWhenCalled(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        String newAbc = entityThis.getAbc() + "abc";
        entityThis.setAbc(newAbc);
        int newDef = entityThis.getDef() + 1;
        entityThis.setDef(newDef);
        java.util.Date newDate = new java.util.Date();
        entityThis.setGhi(newDate);
        JKLValues newJkl = JKLValues[entityThis.getJkl().ordinal() + 1]; // making an assumption about enum syntax and operation here
        entityThis.setJkl(newJkl);
        boolean updateRetVal = entityThis.update();
        if(updateRetVal){
            entityThis.read(entityThis.primaryKey());
            assertEquals(newAbc, entityThis.getAbc());
            assertEquals(newDef, entityThis.getDef());
            assertEquals(newDate, entityThis.getGhi());
            assertEquals(newJkl, entityThis.getJkl());
        } else {
            fail("update() returned false, the update statement threw an exception");
        }
    }

    @Test
    public void updateThrowsExceptionWhenCalledWithNonExisitingPK(){
        EntityThis entityThis = new EntityThis();
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        assertFalse(entityThis.update());
    }

    @Test
    public void deleteRemovesAppropriateRecordFromTable(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        entityThis.delete();
        assertFalse(entityThis.load(2));
    }

    @Test
    public void deleteThrowsExceptionWhenCalledWithNonexisitentPK(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        entityThis.delete();
        assertFalse(entityThis.delete());
    }
    
    @Test
    public void saveCreatesRecordWhenPKEqualsZero(){
        EntityThis entityThis = new EntityThis();
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        entityThis.save();
        
        String newAbc = entityThis.getAbc() + "abc";
        entityThis.setAbc(newAbc);
        int newDef = entityThis.getDef() + 1;
        entityThis.setDef(newDef);
        java.util.Date newDate = new java.util.Date();
        entityThis.setGhi(newDate);
        JKLValues newJkl = JKLValues[entityThis.getJkl().ordinal() + 1]; // making an assumption about enum syntax and operation here
        entityThis.setJkl(newJkl);

        entityThis.read(entityThis.primaryKey());
        assertEquals("abc", entityThis.getAbc());
        assertEquals(25, entityThis.getDef());
        assertEquals(date, entityThis.getGhi());
        assertEquals(jkl, entityThis.getJkl());
    }

    @Test
    public void saveUpdatesRecordWhenPKEqualsNonZero(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        entityThis.save();
        
        String newAbc = entityThis.getAbc() + "abc";
        entityThis.setAbc(newAbc);
        int newDef = entityThis.getDef() + 1;
        entityThis.setDef(newDef);
        java.util.Date newDate = new java.util.Date();
        entityThis.setGhi(newDate);
        JKLValues newJkl = JKLValues[entityThis.getJkl().ordinal() + 1]; // making an assumption about enum syntax and operation here
        entityThis.setJkl(newJkl);

        entityThis.read(entityThis.primaryKey());
        assertEquals("abc", entityThis.getAbc());
        assertEquals(25, entityThis.getDef());
        assertEquals(date, entityThis.getGhi());
        assertEquals(jkl, entityThis.getJkl());
    }

    @Test
    public void loadInstanceContainsCorrectValuesWhenCalled(){
        EntityThis entityThis = new EntityThis();
        entityThis.setAbc("abc");
        entityThis.setDef(25);
        java.util.Date date = new java.util.Date();
        entityThis.setGhi(date);
        JKLValues jkl = JKLValues.X;
        entityThis.setJkl(jkl);
        boolean createRetVal = entityThis.create();
        if(createRetVal){
            entityThis.setAbc("ABC");
            entityThis.setDef(26);
            java.util.Date date2 = new java.util.Date();
            entityThis.setGhi(date2);
            JKLValues jkl2 = JKLValues.Y;
            entityThis.setJkl(jkl2);
            entityThis.load(entityThis.primaryKey());
            assertEquals("abc", entityThis.getAbc());
            assertEquals(25, entityThis.getDef());
            assertEquals(date, entityThis.getGhi());
            assertEquals(jkl, entityThis.getJkl());
        } else {
            fail("create() returned false, the insert statement threw an exception");
        }
    }

    @Test
    public void removeDeletesAppropriateRecordFromTable(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        entityThis.remove();
        assertFalse(entityThis.load(2));
    }

    @Test
    public void removeThrowsExceptionWhenCalledWithNonexisitentPK(){
        EntityThis entityThis = new EntityThis();
        entityThis.read(2);
        entityThis.remove();
        assertFalse(entityThis.remove());
    }
}

