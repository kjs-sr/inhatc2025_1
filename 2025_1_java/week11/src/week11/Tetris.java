package week11;

public class Tetris extends Game{

	public Tetris(String title, String version) {
		super(title, version);
	}

	@Override
	public void gameDesc() {
		System.out.println("Tetris는 퍼즐 게임으로, 소련의 개발자가 처음 디자인하고 프로그래밍한 게임이다.");
	}

}
