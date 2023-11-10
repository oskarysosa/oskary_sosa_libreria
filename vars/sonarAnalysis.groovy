
def call(boolean abortPipeline = false) {
	echo "Ejecución de las pruebas de calidad de código"
	timeout(time: 5, unit: 'MINUTES') {
	}
	
	if (abortPipeline) {
		error "El pipeline se ha abortado debido a un fallo en SonarQube"
	}

}
