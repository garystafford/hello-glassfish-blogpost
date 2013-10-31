The Ant targets in this project require the j2ee.server.home property in the 
project.properties. When working on Windows, this was present. When working with 
NetBeans 7.3 on Linux Ubuntu, the j2ee.server.home property was not present.

To fix, I set the j2ee.server.home property in the project.properties to 
j2ee.server.home=$ASADMIN_HOME. Make sure your the environmental variable, 
$ASADMIN_HOME, is set to your GlassFish directory. In my case:
/home/gstafford/glassfish-3.1.2.2/glassfish.

Reference: http://stackoverflow.com/a/10488054