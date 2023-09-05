def call(credentialsId){
    bat 'java -version'
    withSonarQubeEnv(credentialsId: credentialsId){
        bat 'mvn sonar:sonar -X'
    }
}