echo "Building the Project : %date% : %time%"
mvn install
mvn compiler:compile com.example.demo

echo "Building the Project : Done %date% : %time%"
