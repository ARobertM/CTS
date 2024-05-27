package seminar_14_cts.Test;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class Test1All {
    
    @RunWith(Suite.class)
    @Suite.SuiteClasses({SlowTest.class})
    public class InnerTest1All {
        
        
    }
}
