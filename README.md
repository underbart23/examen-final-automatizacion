# Examen Final - Automatización de Pruebas

## Descripción del Proyecto
Proyecto Java gestionado con Apache Maven que implementa un **Gestor de Inventario** bajo un flujo completo de automatización de pruebas y CI/CD con GitFlow y Jenkins.

## Estrategia de Pruebas Implementada
* **Pruebas Unitarias (`UnitInventarioTest`):** Validación aislada de métodos de ingreso y descuento de stock con JUnit 5.
* **Pruebas de Integración (`IntegrationInventarioTest`):** Verificación de flujos combinados de acumulación y salida de productos.
* **Pruebas de Aceptación (`AcceptanceInventarioTest`):** Validación funcional extremo a extremo previa al despliegue en Staging.

## Ejecución Local de Pruebas
1. Clonar el repositorio: `git clone https://github.com/underbart23/examen-final-automatizacion.git`
2. Ejecutar compilación y suite completa: `mvn clean test`

## Ejecución del Pipeline CI/CD
El archivo `Jenkinsfile` en la raíz define las etapas automatizadas de compilación, pruebas unitarias, pruebas de aceptación, despliegue Blue-Green en Staging y rollback automático en caso de error.