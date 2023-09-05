def call(){
    bat 'java -version'
    withSonarQubeEnv(credentialsId: credentialsId){
        bat 'mvn sonar:sonar'
    }
}