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
            }stage('SonarQube analysis') {
       steps{
        withSonarQubeEnv('SonarQube') {
            sh 'mvn sonar:sonar -Pprofile1'
           }
       }
   }
      stage('SonarQube analysis'){ 
         environment{
               scannerHome = tool 'Sonar'
                   }
       steps{
        withSonarQubeEnv('SonarQube') {
           // sh "${scannerHome}/bin/sonar-scanner"
           sh' mvn verify sonar:sonar'
           }
       }
   }
      /*  stage('deploy')
              {
                  steps
                  {
                      deploy adapters: [tomcat9(credentialsId: '7bba93f5-d5bd-427e-b462-f3c552dad961', path: '', url: 'http://3.15.38.187:8090/')], contextPath: '/finder', war: '**/*.war'
                      //deploy adapters: [tomcat9(credentialsId: '7bba93f5-d5bd-427e-b462-f3c552dad961', path: '', url: 'http://3.16.23.31:8090/')], contextPath: '/cur', war: '**/*.war'
                  }
              }*/
 
}
}
