import sample.java.projet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
Sample  junit test.
**/

Public class SampleJavaProject{

private SampleJavaProject sjp;

@Before

Public final void setup(){
sjp = new SampleJavaProject;
}

/**
Test the generated getter and setter method
*/

@Test
Public final void testGetSet(){
sjp.setName("foo");
assertEquals("foo", sjp.getName());
}
/**
Test the null check in setter
*/

@Test(expected=NullPointerExecption.class)
public final void nullTest(){
sjp.setName(null);
}
}


}
