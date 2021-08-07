pipeline{
    agent any
    environment{
        User_Password= "zinebee12345"
    }
    stages{
    stage('Charger le contenue du depot distant du github'){
        steps{
            git credentialsId: 'git_credentials',url: 'https://github.com/zinebee/famous_art1.git'
        }
    }
    stage('Faire le  build'){
        steps{
            sh 'mvn clean compile'
        }
    }
    stage('package de mon application sous format jar'){
        steps{
                sh 'mvn clean package'
        }
    }
    stage('Test Unitaire'){
        steps{
            sh 'mvn test'
        }
    }
    stage('Build the docker image'){
        steps{
            sh "docker build -t zinebee/famousart.jar:3 ."
        }  
    }
    stage('Mettre cette image dans docker hub'){
        steps{
           sh "docker login -u zinebee -p ${env.User_Password}"
           sh "docker push zinebee/famousart.jar:3"
        }
    }
}
}