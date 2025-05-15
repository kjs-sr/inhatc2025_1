package week11;

public class LOL extends Game{

	public LOL(String title, String version) {
		super(title, version);
	}

	@Override
	public void gameDesc() {
		System.out.println("LOL은 세계 최고의 MOBA 게임입니다.");
	}
	
}
