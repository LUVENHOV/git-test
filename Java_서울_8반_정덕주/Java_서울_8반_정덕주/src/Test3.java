import java.io.File;
import java.io.FileInputStream;

public class Test3 {
	public static void main(String[] args) {

		int money = 10000;
		int price = 0;

		// 파일 읽어오기
		// FileInputStream으로 파일 값을 읽어와서 price에 저장
		// 읽어온 값을 a에 저장하여 String tmp에 char로 형변환하여 추가, 다 읽어온 후 int로 변환
		File file = new File("input.txt");
		try (FileInputStream fis = new FileInputStream(file);) {
			int a;
			String tmp = "";
			while ((a = fis.read()) != -1) {
				tmp += (char) a;
			}
			price = Integer.parseInt(tmp);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일의 값을 읽어올 수 없습니다.");
		}

		int rtnMoney = money - price;

		// 금액, 거스름돈 출력
		System.out.println("투입 금액 : " + money + "원");
		System.out.println("상품 금액 : " + price + "원");
		System.out.println("거스름돈 : " + rtnMoney + "원");
		System.out.println("----------------------");

		// 투입금액 변수 선언
		int change1000 = 0;
		int change500 = 0;
		int change100 = 0;
		int change10 = 0;

		// 거스름돈이 떨어질 때까지 반복문 순환 (최소 값 10원임으로 10원 이상일 때 순환하도록 설정)
		// 남은 돈이 1000, 500, 100, 10원 이상인지 확인하고 해당 변수에 거스름돈 값 저장
		// 처리해야 할 거스름돈 갱신
		while (rtnMoney >= 10) {
			if (rtnMoney > 1000) {
				change1000 = rtnMoney / 1000;
				rtnMoney %= 1000;
				continue;
			} else if (rtnMoney > 500) {
				change500 = rtnMoney / 500;
				rtnMoney %= 500;
				continue;
			} else if (rtnMoney > 100) {
				change100 = rtnMoney / 100;
				rtnMoney %= 100;
				continue;
			} else {
				change10 = rtnMoney / 10;
				rtnMoney %= 10;
				break;
			}
		}

		// 값을 출력
		System.out.println("1000원 : " + change1000);
		System.out.println("500원 : " + change500);
		System.out.println("100원 : " + change100);
		System.out.println("10원 : " + change10);
		System.out.println();
		System.out.println("총 개수 : " + (change1000 + change500 + change100 + change10) + "개");

	}
}
