
class Verde implements EstadoSemaforo {

	@Override
	public void executar(Semaforo semaforo) {
		try {
			System.out.println("VERDE - siga!");
			Thread.sleep(3000);
			semaforo.setEstado(new Amarelo());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Erro no estado do Verde: " + e.getMessage());
		}
	}

}
