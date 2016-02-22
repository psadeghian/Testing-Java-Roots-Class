package roots_package;
import junit.framework.TestCase;

/**
 * Created by SandiferAV on 2/19/2016.
 * Edited by psadeghian on 2/21/2016
 */
public class MyFirstTest extends TestCase {

    private int valueA;
    private int valueB;
    private int valueC;

    public MyFirstTest(String testName) {
        super(testName);
    }
    protected void setUp() throws Exception {
        super.setUp();
        valueA = 1;
        valueB = 2;
        valueC =-8;
    }
    protected void tearDown() throws Exception {
        super.tearDown();
        valueA = 0;
        valueB = 0;
        valueC = 0;
    }
    public void testNumRoots() {
        int num_roots = 2;
    	Roots roots = new Roots(valueA,valueB,valueC);
        //roots.getRoots();
        int num = roots.num_roots();
        assertEquals(num_roots, num);
    }
    public void testRootOne () {
        double root = 2;
    	Roots roots = new Roots(valueA,valueB,valueC);
        //Roots.getRoots(valueA,valueB,valueC);
        double root_one = roots.first_root();
        assertEquals(root,root_one);
    }
    public void testRootTwo () {
        double root = -4;
    	Roots roots = new Roots(valueA,valueB,valueC);
        //Roots.getRoots(valueA,valueB,valueC);
        double root_two = roots.second_root();
        assertEquals(root,root_two);
    }
}