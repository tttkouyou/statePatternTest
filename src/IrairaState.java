class IrairaState extends DogState{
	private static IrairaState s = new IrairaState();
	private IrairaState() {}

	public static DogState getInstance() {
		return s;
	}

	public void tukareta(Dog moto) {

	}

	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}

	public String toString() {
		return "いらいら状態";
	}
}
