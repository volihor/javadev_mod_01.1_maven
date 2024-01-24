package myname;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Unit test for class MyName.
 */
public class MyNameTest
{
    private MyName myNameTest = new MyName();
    private Map mapTest = myNameTest.createMapName( "Name", "LastName");

    @Test
    public void testCreateUserObj() {
        UserMaven userClass = myNameTest.createUserObj("Name", "LastName");

        Assert.assertEquals("Name", userClass.getName());
        Assert.assertEquals("LastName", userClass.getLastName());

        Assert.assertNotNull(userClass);
        Assert.assertNotNull(userClass.getName());
        Assert.assertNotNull(userClass.getLastName());
    }

    @Test
    public void testCreateMapName() {
        Assert.assertEquals("Name", mapTest.get("name"));
        Assert.assertEquals("LastName", mapTest.get("lastName"));

        Assert.assertNotNull(mapTest);
        Assert.assertNotNull(mapTest.get("name"));
        Assert.assertNotNull(mapTest.get("lastName"));
    }

    @Test
    public void testCreateJsonString(){
        String testJsonString = myNameTest.createJsonString(mapTest);
        Assert.assertEquals("{\n  \"name\": \"Name\",\n  \"lastName\": \"LastName\"\n}"
                            , testJsonString);
    }
}