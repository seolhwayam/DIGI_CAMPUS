package Day8;

public interface Ccc extends Aaa, Bbb {
	default void disp4() {
		System.out.println("나는야 디폴트~~~");
	}
	void disp3();

}
