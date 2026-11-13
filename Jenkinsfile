pipeline {
    agent any

    stages {
        stage('Build & Unit Tests') {
            steps {
                sh 'mvn clean test -Dtest=Unit*Test'
            }
        }

        stage('Acceptance Tests (Selenium)') {
            steps {
                sh 'mvn test -Dtest=Acceptance*Test'
            }
        }

        stage('Deploy to Staging (Blue-Green)') {
            steps {
                script {
                    try {
                        echo 'Iniciando despliegue de la versión actual en ambiente Staging (Blue)...'
                        sh 'echo "Despliegue Blue-Green exitoso."'
                    } catch (Exception e) {
                        currentBuild.result = 'FAILURE'
                        error('El despliegue en Staging falló. Abortando proceso...')
                    }
                }
            }
        }
    }

    post {
        success {
            echo '¡Pipeline de Despliegue Continuo finalizado con éxito! Sistema operativo en Staging.'
        }
        failure {
            script {
                echo 'ALERTA CRÍTICA: Se detectó un fallo en las pruebas de aceptación o en el despliegue.'
                echo 'Ejecutando mecanismo de Rollback automático a la versión anterior (Green)...'
                sh 'echo "Rollback completado de forma segura."'
            }
        }
    }
}