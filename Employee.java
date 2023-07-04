package rentCar;

import java.util.Scanner;

public class Employee {
    private String name;
    private String address;
    private String phone;
    
//차량 정보 받고
//고객이 찾는 차량 정보가 일치 하면
//예약일자 정해주고 
//예약 일정이 지나면 추가적으로 금액 발생한다
    public Employee() {
    	
    }

    public Employee(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public void checkListTrue() {
    	System.out.println("가자");
    	System.out.println("차량을 조회합니다.");
    }
    public void checkListFalse() {
    	System.out.println("일이 없어요...");
    }

    public void approveRental() {
        // 최종 차와 고객 일치하는 승인하는 로직 구현
        System.out.println("렌트를 승인했습니다.");
        int day = 1; //기본적으로 제공되는 1일 
        System.out.println("기본적인 렌트일 수는 " + day + "일 입니다");
    }

    public void denyRental() {
        //렌트를 거절하는 로직 구현
        System.out.println("렌트를 거절했습니다.");
        
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            // 직원 정보 입력 받기
            System.out.print("직원 이름: ");
            String name = scanner.nextLine();
            System.out.print("직원 주소: ");
            String address = scanner.nextLine();
            System.out.print("직원 전화번호: ");
            String phone = scanner.nextLine();
            
            
            
            // 입력 값 검증
            if (name.equals("정원") && phone.equals("010")) {
                this.name = name;
                this.address = address;
                this.phone = phone;
                validInput = true;
                System.out.println("관리자로 로그인 되었습니다");
            } else {
                System.out.println("다시 입력하세요");
                scanner.close();
            }
        }

        // 직원 객체 생성
        // 예약 리스트 참고
        Employee check = new Employee();
        System.out.print("예약 정보를 가져올까요...?(true/false) ");
        boolean checking = scanner.nextBoolean();
        // 승인 또는 거절 메소드 호출
        
        if (checking) {
            check.checkListTrue();
        } else {
            check.checkListFalse();
            scanner.close();
            return; // 프로그램 종료
        }
//        if (!checking) {
//            return;
//        }
//
//        // run2 메소드 호출
//        run2();
        
    }

    public void run2() {
        Scanner scanner = new Scanner(System.in);
        Employee rental = new Employee();
        System.out.print("렌트 승인 여부를 입력하세요.(true/false) ");
        boolean approval = scanner.nextBoolean();

        // 승인 또는 거절 메소드 호출
        if (approval) {
            rental.approveRental();
        } else {
            rental.denyRental();
        }

        System.out.println();
        run3();
    }
    public void run3() {
    	int day1 = 1;
    	System.out.println("대여 일수는 기본 " + day1 + "일 입니다");
    }
    
}
