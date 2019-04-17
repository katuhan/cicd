pipeline {

    agent any  

    environment {
        PATH = "/usr/local/go/bin:${env.PATH}"
    }

    stages {
        stage('build') {
            steps {
                echo "hello-world"
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
