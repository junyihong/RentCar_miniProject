package rentCar;

import java.text.NumberFormat;
import java.util. *;
public class Main {
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
// Customer 고객정보, 로그인, 차량조건    	
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.inputInfo();	// 고객 정보 입력받기
        customer.login();		// ~ 님 안녕하세요
        customer.searchCars();	// 차량 조건 입력받기
        customer.searchCarsWithConditions(customer.getPriceRange(), customer.getCarType(), customer.getCarSize(), customer.getManufacturer(), customer.getCarColor());
        employee.run();			//직원 정보 받기
        employee.run2();		//직원 승인 여부
        customer.pickDate();
        employee.run3();		//예약 기간 확인
// Car 차량종류, 차량정보
        //차량종류 입력 받기
        System.out.println("선택된 차량의 상세 정보를 확인하시려면" + customer.cars + "를 입력해주세요.");
        System.out.println("차량 종류: ");
        String type = scanner.nextLine();
        // Car 객체 생성
        Car car = Car.createCarByType(type);
              
        // Car 정보 출력
        if (car != null) {
        System.out.println("차량 종류: " + car.getcarType());	
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        String formattedPrice = numberFormat.format(car.getpriceRange());
        System.out.println("가격대: " + formattedPrice + "원");
        System.out.println("차량 크기: " + car.getcarSize());
        System.out.println("제조사: " + car.getmanufacturer());
        System.out.println("차량 색상: " + car.getcarColor());
        System.out.println("연식: " + car.getModelYear());
        System.out.println("연비: " + car.getFuelEfficiency() + " km/L");
        System.out.println("출력: " + car.getHorsepower() + " 마력");
        System.out.println("연료: " + car.getFuelType());
        } else {
           System.out.println("그런차는 렌트 안해줌 ");
        }


        scanner.close();
    }
}
