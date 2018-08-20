# appiumpoc-tests
Mobile app testing


### Brew Installation  

-  We need brew in order to easily install all other software components.
-  Ensure that you have brew installed on your system, by running the following command in a terminal window:
   which brew

-  If brew is not installed, then it can be installed by running the following command in a terminal window:
   /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
-  Verify brew installation by running the same command again:
   Fatihs-MacBook-Pro:~ bin fatihsafak$ which brew /usr/local/bin/brew


### Maven Installation

-  We need Maven in order to build/run the source code.
-  Ensure that you have maven installed on your system, by running the following command in a terminal window:
   mvn -version

-  If maven is not installed, then the easiest way to install it, is via brew, by running the following command in a terminal    window:
   brew install maven

-  Verify maven installation by running the same command again:
   Fatihs-MacBook-Pro:~~ fatihsafak$ mvn -version Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-  
   24T19:49:05Z) Maven home: /usr/local/Cellar/maven/3.5.3/libexec Java version: 10.0.1, vendor: Oracle Corporation Java home: 
   /Library/Java/JavaVirtualMachines/jdk-10.0.1.jdk/Contents/Home/jre Default locale: en_GB, platform encoding: UTF-8 OS name: 
   "mac os x", version: "10.13.3", arch: "x86_64", family: "mac" 
-  If brew fails on the last step with:

   ........
   Linking /usr/local/Cellar/maven/3.5.93..

   Error: Could not symlink.

   /usr/local/opt is not writable.

   Then you can create the two links to it manually as follows:

   Fatihs-MacBook-Pro:~ fatihsafak$ sudo ln -s /usr/local/Cellar/maven/3.5.3 /usr/local/opt/mvn

   Fatihs-MacBook-Pro:~ fatihsafakj$ sudo ln -s /usr/local/Cellar/maven/3.5.3/bin/mvn /usr/local/bin/mvn
   
   
### Java JDK Installation

-  We need to download the Java JDK 1.8 from here.
-  Select 'Accept Licence Agreement' radio button and then download jdk-8u171-macosx-x64.dmg:
-  Afterwards, install it on your machine by simply following the instructions from        
   https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html.
   
   
### IntelliJ IDEA Installation and Configuration

-  If you don't have the IntelliJ IDE installed on your system, then download it from       
   https://www.jetbrains.com/idea/download/#section=mac. Community Edition should be enough for this project.
-  Once the file has been downloaded, then in Finder double-click it in order to unzip it.
-  Move the unzipped IntelliJ IDEA application file into the Applications folder.
-  In order to open the application just double-click the IntelliJ IDEA icon from within your Applications folder.
-  Once the application is opened, select Import Project and then select the repository for the automation code.
-  Afterwards, select Maven and then Next button to import the project.


### IntelliJ Project Import
1. Open IntelliJ
2. Go To: File > New > Project From Existing Sources
3. Select the project folder
4. Select 'Maven' (on the 'import project from external model')
5. Leave the settings as they are and click on Next (on the Root directory and configurations page) 
6. Click Next (on the 'Select Maven projects to import')
7. (optional) Click the '+' (on the 'Select project SDK')
8. (optional) Add the installed SDK on your machine
9. Click 'Finish' (on the 'Please enter a name to create a new project in intellij IDEA project')
   

## Feature files
- Feature files should have the tags e.g. @done @regression @smoke @essential. Different terms can be used. These tags will     allow us to prioritise and run our test as soon as they are completed.
- Jenkins allows us to run relevant tests through these tags.
   For instance, below line is enough to trigger the job through Jenkins. 
   verify -Dcucumber.options="--tags @driver --tags @done --tags @regression"

