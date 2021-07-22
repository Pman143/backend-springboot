# momentum_active_shoppe

Environment setup instructions:
1. Have Java 8 or later version installed on your environment.
2. Have Maven setup on your environment.
3. Have MongoDB server version 4.2.13 installed in your environment.
4. Do a git clone "git clone https://github.com/Pman143/backend-springboot.git" into your project workspace
5. Do "mvn clean install" in the same directory where your pom file is.
6. The above command will build the fat jar file then you can run your jar file in the target folder using "nohup java -jar demo.jar &"
3. Open your favourite browser and navigate to http://localhost:8080/swagger-ui.html to view services


Alternatively you can run application using your desired IDE.
1. Please ensure that the lombok plugins are installed on your IDE.


I have also deployed the application on AWS EC2 instance:
-> The url to access the swagger document is http://ec2-13-245-21-79.af-south-1.compute.amazonaws.com:8080/swagger-ui.html#/