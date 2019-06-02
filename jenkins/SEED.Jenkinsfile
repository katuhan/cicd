#!/usr/bin/env groovy
pipeline {
    agent any

    options { 
        timestamps() 
    }

    stages {        
          stage('READ CONFIGURATION') {
              steps {
                  sh 'printenv | sort'
                  sh 'date' 
             }
          }
          stage('CREAT JOB1') {
              steps {
                  sh 'printenv | sort'
                  sh 'date' 
             }
          }
    }

    post {
        always {
            echo 'finish!'
        }
        success {
            echo 'all successful'
        }
        failure {
            echo 'something failed'
        }
    }
}
