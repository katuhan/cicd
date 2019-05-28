pipeline {
    agent any

    options { 
        timestamps() 
    }

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
            regexpFilterExpression: 'refs/heads/.*'
        )
    }
    
    stages {        
          stage('build') {
              steps {
                  printenv | sort
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
