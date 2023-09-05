def call(credentialsId){
    bat 'java -version'
    def sonarToken = credentials(credentialsId)
    echo "SonarQube Token: $sonarToken"
    withSonarQubeEnv(credentialsId: credentialsId){
        bat "mvn sonar:sonar -Dsonar.token=$sonarToken"
    }
}