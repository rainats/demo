echo "Building the Project : %date% : %time%"
mvn install:install
mvn compiler:compile com.example.demo
mvn jar:jar
echo "Building the Project : Done %date% : %time%"
