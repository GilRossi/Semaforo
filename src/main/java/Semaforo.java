
class Semaforo {
	
	private EstadoSemaforo estadoAtual;
	
	public Semaforo(EstadoSemaforo estadoInicial) {
		this.estadoAtual = estadoInicial;
	}
	
	public void setEstado(EstadoSemaforo novoEstado) {
		this.estadoAtual = novoEstado;
	}
	
	public void iniciar() {
		while(true) {
			estadoAtual.executar(this);
		}
	}

}
