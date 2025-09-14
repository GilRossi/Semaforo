
class Amarelo implements EstadoSemaforo {

	@Override
	public void executar(Semaforo semaforo) {
		try {
			System.out.println("AMARELO - preste atenção!");
			Thread.sleep(1500);
			semaforo.setEstado(new Vermelho());
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Erro no estado do Amarelo: " + e.getMessage());
		}

	}

}
