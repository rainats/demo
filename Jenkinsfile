pipeline{
    agent any
    tools { 
        maven 'Maven 3.8.1' 
        jdk 'jdk1.8' 
          }
    stages{
        stage('Git-Checkout'){
            steps{
                echo "checking out from git repo";
                git 'https://github.com/rainats/demo.git'
            }
        }
        stage('Build'){
            steps{
                echo "building the checked out project";
                bat 'Build.bat'
                }
 
        }
        stage('Unit-Test'){
            steps{
                echo "Running JUnit Tests";
                bat 'UnitTest.bat'
            }
        }
        stage('Quality-Gate'){
            steps{
                echo "Verifying Quality Gate";
                bat 'Quality.bat'
            }
        }
        stage('Deploy'){
            steps{
                echo "Deploying to Stage Environment for more tests! ";
                bat 'Deploy.bat'
            }
        }
    }
    post{
        always{
            echo "This will always run"
        }
        success{
            echo "This will run only if successful"
        }
        failure{
            echo "This will run only if failed"
        }
        unstable{
            echo "This will run only if the run was marked as unstable"
        }
        changed{
            echo "This will run only if the state of the pipeline has changed"
            echo "For example, if the pipeline was previously failing but is now successful"
        }
    }
}
