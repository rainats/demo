echo "Building the Project : %date% : %time%"
mvn -B -DskipTests clean com.example.demo
javac DemoApplication.java
java DemoApplication.java
echo "Building the Project : Done %date% : %time%"
