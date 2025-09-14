
class Vermelho implements EstadoSemaforo {

	@Override
	public void executar(Semaforo semaforo) {
		try {
			System.out.println("VEMELHO - pare!");
			Thread.sleep(5000);
			semaforo.setEstado(new Verde());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Erro no estado do Vermelho: " + e.getMessage());
		}
	}

}
