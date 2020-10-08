import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    Vector vector1= new Vector(0,0,0);
    Vector vector2= new Vector(0,8,6);
    Vector vector3= new Vector(3,0,4);

@Test
    public void Checklength(){
        assertEquals(0,vector1.length());
        assertTrue(vector2.length() == 10.0);
        assertFalse(vector3.length() != 5.0);
    }
    @Test
    public void CheckscalarProduct(){
        assertEquals(vector1.scalarProduct(vector3), 0);
        assertTrue(vector2.scalarProduct(vector1) == 0);
        assertFalse(vector3.scalarProduct(vector1) == 3);
    }
    @Test
    public void CheckCrossProduct(){
        assertEquals(vector1.crossProduct(vector2), vector1.crossProduct(vector3));
        assertTrue(vector2.crossProduct(vector1).equals(vector3.crossProduct(vector1)));
        assertFalse(vector2.crossProduct(vector1).equals(vector1.crossProduct(vector2)));
    }
    @Test
    public void Checkcos(){
        assertEquals(vector2.cos(vector3), 0.48);
        assertTrue(vector2.cos(vector3) == 0.48);
        assertFalse(vector2.cos(vector3) == 0.65);
    }
    @Test
    public void Checkadd(){
        assertEquals(vector1.add(vector3), vector3.add(vector1));
        assertTrue(vector2.add(vector3).equals(vector3.add(vector2)));
        assertFalse(vector2.add(vector1).equals(vector2.add(vector3)));
    }
    @Test
    public void Checksubtract(){
        assertEquals(vector2.subtract(vector1), vector2);
        assertTrue(vector2.subtract(vector1).equals(vector2));
        assertFalse(vector2.subtract(vector1).equals(vector1));
    }
}
