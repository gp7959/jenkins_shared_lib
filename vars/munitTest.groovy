def call(){
    git 'https://github.com/gp7959/jenkins-demo-api.git'
    bat 'mvn clean test'
}