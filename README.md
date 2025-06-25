### How to run this app from command prompt
- Install docker
- Run below commad from main folder
```
docker-compose up -d
```

  
- Run below commands from target folder
```
export SPRING_CONFIG_LOCATION=classes/application.properties
```
```
java -jar clouds-0.0.1-SNAPSHOT.jar
```

- There is a test page under /src/test/resources/index.html
![image](https://github.com/user-attachments/assets/f41b8782-bcb5-4fa6-803a-dd5406e9bf44)

