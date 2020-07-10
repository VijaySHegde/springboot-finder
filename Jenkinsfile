pipeline {
    agent any
 tools{
    maven 'Maven'
    }
    stages {

      stage('clean')
            {
                steps
                 { 
                    sh 'mvn clean install'
                 }
            }
        
   stage('Build docker image')
		{
			steps
			{
			sh 'docker build -t vijayshegde/myappp:2.0.0 .'
		}
		}
}
}
