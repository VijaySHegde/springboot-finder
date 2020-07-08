pipeline {
    agent any
 tools{
    maven 'maven'
    }
    stages {

      stage('clean')
            {
                steps
                 { 
                    sh 'mvn clean install'
                 }
            }
        
     stage('SonarQube analysis'){ 
        /* environment{
               scannerHome = tool 'Sonar'
                   }
       steps{
        withSonarQubeEnv('SonarQube') {
            sh "${scannerHome}/bin/sonar-scanner"
          // sh' mvn verify sonar:sonar'
           }
       }*/ steps{
         withSonarQubeEnv(credentialsId: 'sonatr_cl', installationName: 'SonarQube') { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar'
    }
   }
     }
   stage('deploy')
              {
                  steps
                  {
                      deploy adapters: [tomcat9(credentialsId: '7bba93f5-d5bd-427e-b462-f3c552dad961', path: '', url: 'http://52.14.6.176:8090/')], contextPath: '/finder', war: '**/*.war'
                      //deploy adapters: [tomcat9(credentialsId: '7bba93f5-d5bd-427e-b462-f3c552dad961', path: '', url: 'http://52.14.6.176:8090/')], contextPath: '/cur', war: '**/*.war'
                  }  
              }   
}
}
