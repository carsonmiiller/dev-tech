import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * EntityThisTest is a test class for EntityThis.
 * 
 * @author Carson Miller and Keegan Johnson
 * @version 2023.04.16
 */
public class EntityThisTest {
    // <function><desired-behavior>when<condition>

    /**
     * This method tests that primaryKeyColumnName() returns the correct value.
     */
    @Test
    public void primaryKeyColumnNameReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        assertEquals("This_pk", entityThis.primaryKeyColumnName());
    }

    /**
     * This method tests that primaryKeyColumnIndex() returns the correct value.
     */
    @Test
    public void primaryKeyColumnIndexReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        assertEquals(0, entityThis.primaryKeyColumnIndex());
    }

    /**
     * This method tests that primaryKey() returns the correct value.
     */
    @Test
    public void primaryKeyReturnsCorrectValueWhenCalled() {
        EntityThis entityThis = new EntityThis();
        entityThis.read(1);
        assertEquals(1, entityThis.primaryKey());
    }

    
}
