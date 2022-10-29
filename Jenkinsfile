pipeline{
    agent any
    environment {
        PASSWORD = credentials('pwd-docker')
    }
    tools{
        maven 'maveninstall'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Abdulpersonal/Devopsproject.git']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker image'){
            steps{
                script{
                    bat 'docker build -t abduli2i/jenkins-cicd .'
                }
            }
        }
        stage('Push Image to Hub'){
            steps{
                script{
                        bat 'docker login -u abduli2i -p %PASSWORD%'
                        bat 'docker push abduli2i/jenkins-cicd'
                }
            }
        }
    }


}