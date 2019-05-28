pipeline {
  agent any
  triggers {
    GenericTrigger(
     genericVariables: [
      [key: 'ref', value: '$.ref']
     ],
     
     causeString: 'Triggered on $ref',
     
     token: 'token123',
     
     printContributedVariables: true,
     printPostContent: true,
     
     silentResponse: false,
    
     regexpFilterText: '$ref',
     regexpFilterExpression: 'refs/heads/*'
    )
  }
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
