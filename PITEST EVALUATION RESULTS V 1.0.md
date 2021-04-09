# PITEST EVALUATION RESULTS **V 1.0**
# PiTest Test Report
***
## Evaluate; The percentage of mutants killed will be used to determine the accuracy of your tests.
## Following are the few steps involved in the process of evaluation for the Model Solution and test classes:
Model Solution
``` 
public int add(int a, int b){
           return a + b;
       }
```
JUnit tests.
```
/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void add_case_1() {
        App app=new App();
        int a=5;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void add_case_2() {
        App app=new App();
        int a=9;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,b);
        assertEquals(expected, actual);
    }
    @Test
    public void add_case_3() {
        App app=new App();
        int a=5;
        int b=4;
        int expected=a + b;
        int actual=app.add(a,(b+1));
        assertNotEquals(expected, actual);
    }
}
```

### Maven Terminal commands 
*****
1. ### mvn clean

        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  0.414 s
        [INFO] Finished at: 2021-04-09T13:15:44+02:00
        [INFO] ------------------------------------------------------------------------

1. ###  mvn validate
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  0.132 s
        [INFO] Finished at: 2021-04-09T13:16:50+02:00
        [INFO] ------------------------------------------------------------------------
1. ###  mvn compile
        [INFO] Compiling 1 source file to C:\Users\rashi\Desktop\Thesis\PiTest\target\classes
        [INFO] ------------------------------------------------------------------------
        [INFO] BUILD SUCCESS
        [INFO] ------------------------------------------------------------------------
        [INFO] Total time:  1.353 s
        [INFO] Finished at: 2021-04-09T13:17:16+02:00
        [INFO] ------------------------------------------------------------------------
        
Compiled files are in target folder
        
1. ###  mvn test
       [INFO] -------------------------------------------------------
       [INFO]  T E S T S
       [INFO] -------------------------------------------------------
       [INFO] Running com.app.AppTest
       [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s - in com.app.AppTest
       [INFO]
       [INFO] Results:
       [INFO]
       [INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
       [INFO]
       [INFO] ------------------------------------------------------------------------
       [INFO] BUILD SUCCESS
       [INFO] ------------------------------------------------------------------------
       [INFO] Total time:  3.009 s
       [INFO] Finished at: 2021-04-09T13:18:03+02:00
       [INFO] ------------------------------------------------------------------------


### Pitest-report Terminal commands or the Run MyPITRunner
******
1. ###  mvn org.pitest:pitest-maven:mutationCoverage OR intellij MyPITRunner
       [INFO] --- pitest-maven:1.6.2:mutationCoverage (default-cli) @ PiTest ---
       [INFO] Found plugin : Default csv report plugin
       [INFO] Found plugin : Default xml report plugin
       [INFO] Found plugin : Default html report plugin
       [INFO] Found plugin : Static initializer code detector plugin
       [INFO] Found plugin : Static initializer filter plugin
       [INFO] Found plugin : Excluded annotations plugin
       [INFO] Found plugin : Try with resources filter
       [INFO] Found plugin : Inlined finally block filter plugin
       [INFO] Found plugin : Implicit null check filter
       [INFO] Found plugin : Method reference null check filter
       [INFO] Found plugin : For each loop filter
       [INFO] Found plugin : Enum constructor filter
       [INFO] Found plugin : Logging calls filter
       [INFO] Found plugin : Infinite for loop filter
       [INFO] Found plugin : Long running iterator loop filter
       [INFO] Found plugin : For loop counter filter
       [INFO] Found plugin : Kotlin junk mutations filter
       [INFO] Found plugin : Max mutations per class limit
       [INFO] Found plugin : Equals shortcut equivalent mutant filter
       [INFO] Found plugin : Trivial return vals equivalence filter
       [INFO] Found plugin : Mutant export plugin
       [INFO] Found shared classpath plugin : Default mutation engine
       [INFO] Found shared classpath plugin : JUnit plugin
       [INFO] Found shared classpath plugin : TestNG plugin
       [INFO] Adding org.pitest:pitest to SUT classpath
       [INFO] Mutating from C:\Users\rashi\Desktop\Thesis\PiTest\target\classes
       [INFO] Defaulting target classes to match packages in build directory
       [INFO] Defaulting target tests to match packages in test build directory
       13:18:45 PIT >> INFO : Verbose logging is disabled. If you encounter a problem, please enable it before reporting an issue.
       13:18:45 PIT >> INFO : Sending 2 test classes to minion
       13:18:45 PIT >> INFO : Sent tests to minion
       13:18:45 PIT >> INFO : MINION : 13:18:45 PIT >> INFO : Checking environment
       
       13:18:45 PIT >> INFO : MINION : 13:18:45 PIT >> INFO : Found  3 tests
       
       13:18:45 PIT >> INFO : MINION : 13:18:45 PIT >> INFO : Dependency analysis reduced number of potential tests by 0
       
       13:18:45 PIT >> INFO : MINION : 13:18:45 PIT >> INFO : 3 tests received
       
       \13:18:45 PIT >> INFO : Calculated coverage in 0 seconds.
       13:18:45 PIT >> INFO : Incremental analysis reduced number of mutations by 0
       13:18:45 PIT >> INFO : Created  1 mutation test units
       /13:18:46 PIT >> INFO : Completed in 1 seconds
       ================================================================================
       - Mutators
       ================================================================================
       > org.pitest.mutationtest.engine.gregor.mutators.MathMutator
       >> Generated 1 Killed 1 (100%)
       > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0
       > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0
       > NO_COVERAGE 0
       --------------------------------------------------------------------------------
       > org.pitest.mutationtest.engine.gregor.mutators.PrimitiveReturnsMutator
       >> Generated 1 Killed 1 (100%)
       > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0
       > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0
       > NO_COVERAGE 0
       --------------------------------------------------------------------------------
       ================================================================================
       - Timings
       ================================================================================
       > scan classpath : < 1 second
       > coverage and dependency analysis : < 1 second
       > build mutation tests : < 1 second
       > run mutation analysis : < 1 second
       --------------------------------------------------------------------------------
       > Total  : 1 seconds
       --------------------------------------------------------------------------------
       ================================================================================
       - Statistics
       ================================================================================
       >> Generated 2 mutations Killed 2 (100%)
       >> Mutations with no coverage 0. Test strength 100%
       >> Ran 2 tests (1 tests per mutation)
       [INFO] ------------------------------------------------------------------------
       [INFO] BUILD SUCCESS
       [INFO] ------------------------------------------------------------------------
       [INFO] Total time:  3.456 s
       [INFO] Finished at: 2021-04-09T13:18:46+02:00
       [INFO] ------------------------------------------------------------------------
***
If you have run Pitest via Terminal: Check out the target/pit-report
***
Intellij console should look similar to 

    13:25:36 PIT >> INFO : Verbose logging is disabled. If you encounter an problem please enable it before reporting an issue.
    13:25:36 PIT >> INFO : Sending 2 test classes to minion
    13:25:36 PIT >> INFO : Sent tests to minion
    13:25:36 PIT >> INFO : MINION : 13:25:36 PIT >> INFO : Checking environment
    
    13:25:36 PIT >> INFO : MINION : 13:25:36 PIT >> INFO : Found  3 tests
    
    13:25:36 PIT >> INFO : MINION : 13:25:36 PIT >> INFO : Dependency analysis reduced number of potential tests by 0
    
    13:25:36 PIT >> INFO : MINION : 13:25:36 PIT >> INFO : 3 tests received
    
    13:25:36 PIT >> INFO : Calculated coverage in 0 seconds.
    \13:25:37 PIT >> INFO : Created  1 mutation test units
    /================================================================================
    - Mutators
    ================================================================================
    > org.pitest.mutationtest.engine.gregor.mutators.ReturnValsMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    > org.pitest.mutationtest.engine.gregor.mutators.MathMutator
    >> Generated 1 Killed 1 (100%)
    > KILLED 1 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 0 
    --------------------------------------------------------------------------------
    ================================================================================
    - Timings
    ================================================================================
    > scan classpath : < 1 second
    > coverage and dependency analysis : < 1 second
    > build mutation tests : < 1 second
    > run mutation analysis : < 1 second
    --------------------------------------------------------------------------------
    > Total  : 1 seconds
    --------------------------------------------------------------------------------
    ================================================================================
    - Statistics
    ================================================================================
    >> Generated 2 mutations Killed 2 (100%)
    >> Ran 2 tests (1 tests per mutation)
    13:25:37 PIT >> INFO : Completed in 1 seconds
    
    Process finished with exit code 0
    Open report in browser

click to Open the report in browser.

*************

![Pit Test Coverage Report Package Summary](https://github.com/rqkohistani/PiTest/blob/main/src/main/resources/202104091318/Pit%20Test%20Coverage%20Report%20Package%20summary.JPG)

***
![Pit Test Coverage Report Mutation Summary](https://github.com/rqkohistani/PiTest/blob/main/src/main/resources/202104091318/Mutations.JPG)

***
![Pit Test Coverage Report Project Summary](https://github.com/rqkohistani/PiTest/blob/main/src/main/resources/202104091318/Pit%20Test%20Coverage%20Report%20project%20summary.JPG)
***