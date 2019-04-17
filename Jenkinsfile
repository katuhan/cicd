pipeline {
    agent none
    stages {
        stage('build-a') {
             agent {
                dockerfile {
                    label 'my-apache2'
                    additionalBuildArgs  '-t my-apache2 '
                    args '-dit --name my-running-app-a -p 8080:80 my-apache2'
                }
            }
            steps {
                echo 'container a!'
            }
        }
        stage('build-b') {
             agent {
                dockerfile {
                    label 'my-apache2'
                    additionalBuildArgs  '-t my-apache2 '
                    args '-dit --name my-running-app-b -p 8080:80 my-apache2'
                }
            }
            steps {
                echo 'container b!'
            }
        }
        stage() {
            agent { label 'my-apache2' }
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
