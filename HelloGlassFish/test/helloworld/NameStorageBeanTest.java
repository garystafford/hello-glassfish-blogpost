package helloworld;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Gary A. Stafford
 */
public class NameStorageBeanTest {

    private NameStorageBean instance = null;
    private EJBContainer container = null;

    public NameStorageBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws NamingException {
        container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        instance = (NameStorageBean) container.getContext().
                lookup("java:global/classes/NameStorageBean");
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class NameStorageBean.
     */
    @Test
    public void testGetName() throws Exception {
        System.out.println("getName");
        String expResult = "Test";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
        container.close();
    }
}