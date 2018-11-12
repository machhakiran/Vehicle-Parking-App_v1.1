# Vehicle-Parking-App_v1.1

Operating System
-----------------
Ubuntu 18

JDK instalaltion:
--------------------
Please Make sure that JAVA_HOME environment variable is set and points to your JDK installation in your system.
So to install Java 8 Open the terminal and run the following commands

$ sudo add-apt-repository ppa:webupd8team/java -y
$ sudo add-apt-repository ppa:webupd8team/java -y
$ sudo apt-get update
$ sudo apt-get update
$ sudo apt install oracle-java8-installer
$ sudo apt install oracle-java8-installer
$ sudo apt install oracle-java8-set-default
$ sudo apt install oracle-java8-set-default


Maven Installation:
--------------------
Install Maven-3
$ cd /opt/
$ sudo wget http://www-eu.apache.org/dist/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.tar.gz
$ cd /opt/
$ sudo wget http://www-eu.apache.org/dist/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.tar.gz

$ sudo tar -xf apache-maven-3.5.3-bin.tar.gz
$ sudo mv apache-maven-3.5.3/ apache-maven/
$ sudo tar -xf apache-maven-3.5.3-bin.tar.gz
$ sudo mv apache-maven-3.5.3/ apache-maven/

$ sudo update-alternatives --install /usr/bin/mvn maven /opt/apache-maven/bin/mvn 1001
$ sudo update-alternatives --install /usr/bin/mvn maven /opt/apache-maven/bin/mvn 1001

Step 3 . verify if maven is installed
To verify maven  run the following command
$ mvn -v
$ mvn -v
or
$ mvn --version;
$ mvn --version;

Gojek Application Running 
----------------------------
Step 1:
  Copy GojekApp under the location path
  ------------------------------------------
  /bv_data/bv_app/GojekApp
Step 2:
 cd  /bv_data/bv_app/GojekApp
 
 Case 1: Run day to day Operation Mode 
 -----------------------------------------
 ./GojekParkingApplication.sh
 
 Case 2: Run Bulk Operation Mode 
 --------------------------------------
 ./GojekParkingBulkApplication.sh
  
Log Verification:
--------------------------
/bv_data/bv_app/GojekApp/logs


