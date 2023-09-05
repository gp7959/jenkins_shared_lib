def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId){
        bat "mvn sonar:sonar -Dsonar.token=$credentialsId"
    }
}