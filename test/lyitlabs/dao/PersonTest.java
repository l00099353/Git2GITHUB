/**
 * 
 */
package lyitlabs.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Martin Redmond l00099353
 *
 */
public class PersonTest extends Person {
		Person p;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
			p = new Person("Joe","Bloggs",10);
	}
	

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#Person(java.lang.String,java.lang.String,int)}.
	 */
	@Test
	public void testPerson() {
		assertNotNull(p);
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#Person#getFirstName()}.

	*@Test

	/**
	 * Test method for {@link lyitlabs.dao.Person#getFirstName()}.
	 */
	@Test
	public void testGetFirstName() throws NoSuchFieldException, IllegalAccessException {
		 //testing getters using reflection
			final Person p2 = new Person();
			final java.lang.reflect.Field field = p2.getClass().getDeclaredField("FirstName");
			field.setAccessible(true);
			field.set(p2, "Sean");
			final String result = p2.getFirstName();
			assertEquals("Field not properly retrieved.",result,"Sean");
		
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#setFirstName(java.lang.String)}.
	 */
//	@Test
	public void testSetFirstName() throws NoSuchFieldException, IllegalAccessException {
//			//testing setters using reflection
			final Person p2 = new Person("Sean","Doherty",5);
			p2.setFirstName("Shaun");
			final java.lang.reflect.Field field = p2.getClass().getDeclaredField("FirstName");
			field.setAccessible(true);
			assertEquals("Field do not match each other.", field.get(p2),"Shaun");
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#getLastName()}.
	 */
	@Test
	public void testGetLastName() throws NoSuchFieldException, IllegalAccessException{
		//testing getters using reflection
			final Person p2 = new Person();
			final java.lang.reflect.Field field = p2.getClass().getDeclaredField("LastName");
			field.setAccessible(true);
			field.set(p2, "Dockerty");
			final String result = p2.getLastName();
			assertEquals("Field not properly retrieved.",result,"Dockerty");
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#setLastName(java.lang.String)}.
	 */
	@Test
	public void testSetLastName() throws NoSuchFieldException, IllegalAccessException{
		//testing setters using reflection
		final Person p2 = new Person("aine","doherty",5);
		p2.setLastName("Dockerty");
		final java.lang.reflect.Field field = p2.getClass().getDeclaredField("LastName");
		field.setAccessible(true);
		assertEquals("Field do not match each other.", field.get(p2),"Dockerty");
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#getAge()}.
	 */
	@Test
	public void testGetAge() {
	//	fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link lyitlabs.dao.Person#setAge(int)}.
	 */
	@Test
	public void testSetAge() {
		p.setAge(12); // TODO
		assertTrue(p.getAge()==12);
	}

}
