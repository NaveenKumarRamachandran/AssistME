# AssistME
Sample Swagger and Actuator Implementation


For Swagger Gradle plugins 

plugins {
	id("org.springdoc.openapi-gradle-plugin") version "1.3.4"
}

dependencies
{
  implementation 'org.springdoc:springdoc-openapi-ui:1.6.9'
}


Once added the Dependencies 
Rebuild the Gradle then run the Application 


localhost:1000/swagger-ui/index.html 
For My case server is running in the port Number 1000


