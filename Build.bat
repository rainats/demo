echo "Building the Project : %date% : %time%"
mvn install
mvn compile com.example.demo
mvn package
echo "Building the Project : Done %date% : %time%"
