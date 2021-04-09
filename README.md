# Maven PiTest Quick Start
PIT is a state of the art **mutation testing** framework that provides **industry-leading research coverage** for Java and the **jvm**. It's fast, scalable, and works with today's test and construct tools [pitest.org](https://pitest.org/).
***
#### why Pitest?
    "There are other mutation testing systems for Java, but they are not widely used.
     
     They are mostly slow, difficult to use and written to meet the needs of academic research rather than
      real development teams.
     
     PIT is different. It's
     
     fast - can analyse in minutes what would take earlier systems days
     easy to use - works with ant, maven, gradle and others
     actively developed
     actively supported" 
More look ups go to  [pitest.org](https://pitest.org/) 
## PIT is available from [maven central](https://search.maven.org/search?q=a:pitest-maven).
 ## Preparing the project
 ## Prerequisites
 
 ### Note: This commands are mainly for Windows users. If you are using another OS please look for specific commands.
 1. The first prerequisite is Java JDK 8 must be pre-installed. To check if you are set up, fire up a terminal and try the following:
    1. javac -version
         1. If you have JDK you will see an output similar to
         
           javac 1.8.0_281
    1. If you are missing java compiler then you have to install it [click here](https://github.com/rqkohistani/JDK_MAVEN_EVOSUITE)
    
              'javac' is not recognized as an internal or external command, operable program or batch file. 
              
 1. The second prerequisite is Apache Maven. Please make sure you have version 3.1 or newer installed. To determine which version of Maven you are using, type the following command:
          
         mvn -v, mvn -version 
     1. You should see something similar to 
             
             Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
             Maven home: C:\Program Files\MavenJar\apache-maven-3.6.3\bin\..
             Java version: 1.8.0_281, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_281\jre
             Default locale: en_US, platform encoding: Cp1252
             OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
       1. If you are missing Maven then you have to install it [click here](https://github.com/rqkohistani/JDK_MAVEN_EVOSUITE)
 
 ******************
 ## Creating a project
 ##### copy paste the mvn archetype to generate the project
 ***
###      mvn archetype:generate -DgroupId=com.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
***
 1. cd my-app
 1. mvn validate
 1. mvn compile
 1. mvn test
     1. If you get any compilation error without any configuration then you must setup your JDK according to my instructions.
     2. Reasons could be many: [click here](https://github.com/rqkohistani/JDK_MAVEN_EVOSUITE).
     
If this worked properly, you should see something like this:
        
    [INFO] -------------------------------------------------------
    [INFO]  T E S T S
    [INFO] -------------------------------------------------------
    [INFO] Running com.app.AppTest
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.035 s - in com.app.AppTest
    [INFO]
    [INFO] Results:
    [INFO]
    [INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  3.035 s
    [INFO] Finished at: 2021-04-09T12:22:07+02:00
    [INFO] ------------------------------------------------------------------------
***
### That’s it, you’re up and running
*** 
### mutationCoverage goal

The mutation coverage goal analyses all classes in the codebase that match the target tests and target classes filters.

It can be run directly from the commandline

       mvn org.pitest:pitest-maven:mutationCoverage
***
The results should similar to

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
    12:26:46 PIT >> INFO : Verbose logging is disabled. If you encounter a problem, please enable it before reporting an issue.
    12:26:46 PIT >> INFO : Sending 2 test classes to minion
    12:26:46 PIT >> INFO : Sent tests to minion
    12:26:47 PIT >> INFO : MINION : 12:26:46 PIT >> INFO : Checking environment
    
    12:26:47 PIT >> INFO : MINION : 12:26:47 PIT >> INFO : Found  1 tests
    
    12:26:47 PIT >> INFO : MINION : 12:26:47 PIT >> INFO : Dependency analysis reduced number of potential tests by 0
    
    12:26:47 PIT >> INFO : MINION : 12:26:47 PIT >> INFO : 1 tests received
    
    /12:26:47 PIT >> INFO : Calculated coverage in 0 seconds.
    12:26:47 PIT >> INFO : Incremental analysis reduced number of mutations by 0
    12:26:47 PIT >> INFO : Created  1 mutation test units
    /12:26:47 PIT >> INFO : Completed in 0 seconds
    ================================================================================
    - Mutators
    ================================================================================
    > org.pitest.mutationtest.engine.gregor.mutators.VoidMethodCallMutator
    >> Generated 1 Killed 0 (0%)
    > KILLED 0 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0
    > NO_COVERAGE 1
    --------------------------------------------------------------------------------
    ================================================================================
    - Timings
    ================================================================================
    > scan classpath : < 1 second
    > coverage and dependency analysis : < 1 second
    > build mutation tests : < 1 second
    > run mutation analysis : < 1 second
    --------------------------------------------------------------------------------
    > Total  : < 1 second
    --------------------------------------------------------------------------------
    ================================================================================
    - Statistics
    ================================================================================
    >> Generated 1 mutations Killed 0 (0%)
    >> Mutations with no coverage 1. Test strength 0%
    >> Ran 0 tests (0 tests per mutation)
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  2.787 s
    [INFO] Finished at: 2021-04-09T12:26:47+02:00
    [INFO] ------------------------------------------------------------------------
 
#### Note: By default pitest will mutate all code in your project. You can limit which code is mutated. [To use exact class names go to documentation](https://pitest.org/quickstart/maven/) However, default is used for this project. 
***       

### Open Intellij and add your classes with their tests.
### Start all over again 
### Note: you must follow the steps in order to generate mutants.
1. mvn clean
1. mvn validate
1. mvn compile
1. mvn test
1. mvn org.pitest:pitest-maven:mutationCoverage
***

##### Manual steps to configure Intellij 

1. Run 
    1. Edit Configurations...
    1. add PIT Runner
        1. If PIT Runner is not found in the Template 
            1. If PIT Runner is not found in the Template 
            1. Go to File
            1. Settings 
            1. Plugins
            1. Look at PIT mutation testing idea plugin and install it
       1. Name: What you prefer. E.g MyPITRunner
       1. Leave the default settings
       1. Run it you should see in target/pit-reports the new output
            1. If You get an error set up Intellij settings properly.
                1. File
                    1. Project Structure
                    1. Project
                         1. Project SDK
                        1. Select the 1.8 (java version "1.8.0_281")
                            1. If you do not find it. add New
                            1. JDK
                            1. Java directory.
                             1. e.g C:\Program Files\Java\jdk1.8.0_281
                   1. Project language level
                        1. Select 8-Lambdas, type annotations etc.
***
### MyPITRunner
#### You should see something similar to 
    12:43:01 PIT >> INFO : Verbose logging is disabled. If you encounter an problem please enable it before reporting an issue.
    12:43:01 PIT >> INFO : Sending 2 test classes to minion
    12:43:01 PIT >> INFO : Sent tests to minion
    12:43:01 PIT >> INFO : MINION : 12:43:01 PIT >> INFO : Checking environment
    
    12:43:02 PIT >> INFO : MINION : 12:43:02 PIT >> INFO : Found  1 tests
    
    12:43:02 PIT >> INFO : MINION : 12:43:02 PIT >> INFO : Dependency analysis reduced number of potential tests by 0
    
    12:43:02 PIT >> INFO : MINION : 12:43:02 PIT >> INFO : 1 tests received
    
    /12:43:02 PIT >> INFO : Calculated coverage in 0 seconds.
    12:43:02 PIT >> INFO : Created  1 mutation test units
    /================================================================================
    12:43:02 PIT >> INFO : Completed in 1 seconds
    - Mutators
    ================================================================================
    > org.pitest.mutationtest.engine.gregor.mutators.VoidMethodCallMutator
    >> Generated 1 Killed 0 (0%)
    > KILLED 0 SURVIVED 0 TIMED_OUT 0 NON_VIABLE 0 
    > MEMORY_ERROR 0 NOT_STARTED 0 STARTED 0 RUN_ERROR 0 
    > NO_COVERAGE 1 
    --------------------------------------------------------------------------------
    ================================================================================
    - Timings
    ================================================================================
    > scan classpath : < 1 second
    > coverage and dependency analysis : < 1 second
    > build mutation tests : < 1 second
    > run mutation analysis : < 1 second
    --------------------------------------------------------------------------------
    > Total  : < 1 second
    --------------------------------------------------------------------------------
    ================================================================================
    - Statistics
    ================================================================================
    >> Generated 1 mutations Killed 0 (0%)
    >> Ran 0 tests (0 tests per mutation)
    
    Process finished with exit code 0
    Open report in browser
    
***
#### Click Open report in browser
#### You can now see Pit Test Coverage Report and Pit Test Coverage Report.
