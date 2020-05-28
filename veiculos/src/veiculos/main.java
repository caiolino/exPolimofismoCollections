package veiculos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarroPasseio carPass = new CarroPasseio();
		
		carPass.EntrVeic(50, 100, 50000);
		carPass.EntrPass("azol", "testeModelo");
		carPass.MostrVeic();
		carPass.MostrPass();
		
		Caminhao bino = new Caminhao();
		
		bino.EntrVeic(80, 800, 8000);
		bino.EntrCAm(800, 5, 10);
		bino.MostrVeic();
		bino.MostrCam();
		
	}
	
	

}
