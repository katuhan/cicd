#!/usr/bin/env groovy
pipeline {
    agent any

    options { 
        timestamps() 
        skipDefaultCheckout()
    }

    //triggers {
    //    GenericTrigger(
    //        genericVariables: [
    //            [key: 'ref', value: '$.ref'],
    //            [key: 'reftype', value: '$.ref_type']
    //        ],
    //        causeString: 'Triggered on $ref',
    //        token: 'hello',
    //        printContributedVariables: true,
    //        printPostContent: true,
    //        silentResponse: false,
    //        regexpFilterText: '$reftype=$ref',
    //        regexpFilterExpression: 'tag=MODULE.*'
    //    )
    //}
    //
    stages {        
          stage('build') {
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
