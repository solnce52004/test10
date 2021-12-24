pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh "./gradlew build"
            }
        }
        stage('Run') {
            steps {
                sh "java -jar ./build/libs/demo-0.0.1-SNAPSHOT.jar"
            }
        }
    }
}
