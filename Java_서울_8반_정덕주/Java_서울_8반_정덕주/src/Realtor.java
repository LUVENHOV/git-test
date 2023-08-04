import java.util.ArrayList;
import java.util.List;

public class Realtor {
	
	// 싱글톤 구현 1. 유일 객체 생성 후 private
	private static Realtor r = new Realtor();
	List<House> houseList = new ArrayList<>();
	
	// 싱글톤 구현 2. 생성자 private
	private Realtor() {
		
	}
	
	// 싱글톤 구현 3. 유일 객체 가져올 수 있는 메서드 생성, public
	public static Realtor getInstance() {
		return r;
	}
	
	
	// sale 메소드 구현
	// houseList 탐색하여 id가 같은 house 객체가 있으면 list에서 해당 집 삭제 후 true 반환, 없으면 false 반환
	public boolean sale(int id) {
		for (House house : houseList) {
			if (house.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	// purchase 메소드 구현
	// houseList에 house 인자 추가
	public void purchase(House house) {
		houseList.add(house);
	}
	

}
