echo "Building the Project : %date% : %time%"
mvn install
mvn compiler:compile com.example.demo
mvn compiler:testCompile 
mvn jar:jar
echo "Building the Project : Done %date% : %time%"
