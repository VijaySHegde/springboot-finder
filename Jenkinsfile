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
     
}
}
