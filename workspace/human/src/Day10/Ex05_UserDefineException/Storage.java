package Day10.Ex05_UserDefineException;

public class Storage {

	// 창고에 보관한 물건 개수
	private int count;
	// 보관 가능한 최대 물건 개수
	final static int MAX_COUNT = 20;
	
	// 생성자
	public Storage() {

	}
	
	// 입고
	// void : 반환타입이 없음을 의미 (return 키워드로 반환값 지정 불가)
	// int ---> return (int)값;
	public void in(int ciunt) throws StorageOverFlowException {
		if( this.count+count > MAX_COUNT ) {
			// 강제 예외 발생 (throw)
			throw new StorageOverFlowException("입고 불가");
		}
		this.count += count;
	}
	// 출고
	public void out(int count) throws StorageOverFlowException {
		if( this.count-count < 0) {
			throw new StorageOverFlowException("출고 불가");
		}
		this.count -= count;
	}
}
