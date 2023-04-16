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
}
