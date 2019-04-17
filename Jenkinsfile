pipeline {

    agent any  

    environment {
        PATH = "/usr/local/go/bin:${env.PATH}"
    }

    stages {
        stage('build') {
            steps {
                sh 'docker build -t my-apache2 .'
                sh 'docker run -dit --name my-running-app -p 8080:80 my-apache2'
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
        unstable {
            echo 'marked as unstable'
        }
        changed {
            echo 'the state of the Pipeline has changed'
        }
    }
}
