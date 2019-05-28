pipeline {
    agent any
    stages {        
        stage('build') {
            steps {
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
        unstable {
            echo 'marked as unstable'
        }
        changed {
            echo 'the state of the Pipeline has changed'
        }
    }
}
