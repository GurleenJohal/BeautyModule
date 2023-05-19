pipeline {
  agent any
  stages {
    stage('Source code') {
      steps {
       git branch: 'branch1', url: 'https://github.com/GurleenJohal/BeautyModule.git'
        echo "Source code"
      }
    }
    stage('Build') {
      steps {
        bat script:'mvn compile'
        echo "Build"
      }
    }
    stage('Run test') {
      steps {
        bat script:'mvn test -Dbrowser-localchrome'
        echo "Test Run"
       }
    }
    stage('Deploy') {
      steps {
        echo "Deploy Stage"
       }
    }
  }
}
