def call(credentialsId){
withCredentials([string(credentialsId: credentialsId, variable: 'sonarToken')]){
        bat "mvn sonar:sonar -Dsonar.token=${sonarToken}"
    }
}