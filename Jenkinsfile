pipeline {
    agent any

    stages {
        stage('Checkout Source') {
            steps {
                checkout scm
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'mvn test -Dtest=UnitInventarioTest'
            }
        }

        stage('Integration Tests') {
            steps {
                sh 'mvn test -Dtest=IntegrationInventarioTest'
            }
        }
    }

    post {
        success {
            echo '¡Pipeline de CI ejecutado exitosamente con el Gestor de Inventario!'
        }
        failure {
            echo 'ALERTA: Hubo un fallo en la compilación o en las pruebas automatizadas del inventario.'
        }
    }
}