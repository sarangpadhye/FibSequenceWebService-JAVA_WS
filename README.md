# FibSequenceWebService-JAVA_WS
A Web Service which generates a fibonacci sequence

Overview :
--------------
This project creates a web service to generates first n fibonacci numbers upon giving
n as the input number. This project uses the SOAP as a protocol for messaging
between the WebService and any program which wishes to consume this service. More 
specifically this uses a JAVA-WS specification. This project uses GlassFish
Server to publish this application. This project current would be published and
host on the local machine.

Run/Deploy Instructions:
-----------------------------
1) Download and install Eclipse IDE for JAVA EE Developers.
http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/kepler/SR2/eclipse-jee-kepler-SR2-win32-x86_64.zip

2) Download and install Java EE SDK Update 1
This would download and install the GlassFish4.0 Server.
http://www.oracle.com/technetwork/java/javaee/downloads/index.html

3) Steps to make GlassFish Server available in eclipse
https://computingat40s.wordpress.com/how-to-create-a-glassfish-server-available-at-eclipse/

Deploying the Web Service :
-------------------------------
1) Create a new "Dynamic Web Project" in Eclipse EE. Copy the package org.emg.fibonacci
in Java Resources/src

2) Right click the project and select "Build Project".

3) Right click on the project and select "Run As" , "Run on Server". This deploys
the Webservice.

4) The Webservice deployed can be seen on the admin path for the GlassFish under
Applications tab.

5) A WSDL generated would look like this --> http://localhost:8080/FibonacciWebService/FibonacciSequenceService?wsdl
In the wsdl link above the "FibonacciWebService" is the project name. This can change, the rest remains the same.

Link to the GlassFish admin console  :http://localhost:4848/common/index.jsf

Consuming the Service :
--------------------------------
1) Create a JAVA project in eclipse.

2) Go to the directory of the project and in the src directory execute the following command
via command line

wsimport -keep http://localhost:8080/FibonacciWebService/FibonacciSequenceService?wsdl

A package with target org.emc.fibonacci should be created in src with all the required
source files. The GlassFish server should be running locally while doing this activity.

3) Copy the file Fibonacciclient.java and place in the src or any other package in the same project.
Run the code and check the results.

Test the Webservice
--------------------------------
1) This Web Service has been tested using the SOAPUI tool. The project included as 
a SOAPUI Project "FibSequence-soapui-project.xml" contains a test suite with test suite.

How to use SOAP UI
--------------------------------
1) Download the free version of SOAP UI.
http://sourceforge.net/projects/soapui/?source=typ_redirect

2) Click on the File>>Import project. Give the path to the saved file "FibSequence-soapui-project.xml"

3) Run the Test Suite and see the results.
http://www.soapui.org/functional-testing/reference/testsuite-reference.html
