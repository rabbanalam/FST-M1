import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    // Test fixtures that declares static arrayList named list.
    static ArrayList<String> list;

    //intialize test fixtures before each test method

    @BeforeEach
    void setUp() throws Exception{
        list=new ArrayList<String>();
        list.add("Alpha");
        list.add("Beta");
    }

    //Test method to test the insert operation
    @Test
    public void insertTest(){
        //Assertion for Size
        assertEquals(2,list.size(),"Wrong Size");

        //Add new element
        list.add(2,"Charlie");

        assertEquals(3,list.size(),"Wrong Size");

        //Assert individual elements
        assertEquals("Alpha",list.get(0),"Wrong element");
        assertEquals("Beta",list.get(1),"Wrong element");
        assertEquals("Charlie",list.get(2),"Wrong element");
    }

    //Test method to test the replace operation
    @Test
    public void replaceTest(){
        //Replace new element--
        list.set(1,"Charlie");

        //assert size of list
        assertEquals(2,list.size(),"Wrong Size");

        //assert individual elements-->
        assertEquals("Alpha",list.get(0),"Wrong element");
        assertEquals("Beta",list.get(1),"Wrong element");
    }
}
