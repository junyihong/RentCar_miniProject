package rentCar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Customer {
    private String name;
    private String phoneNumber;
    private String username;
    private String password;
    private int priceRange;
    private String priceRangeText;
    private int carType;
	private String carTypeText;
    private int carSize;
    private String carSizeText;
    private int manufacturer;
    private String manufacturerText;
    private int carColor;
    private String carColorText;
    private String Date;
    public List<String> cars;
    
    public int getPriceRange() {
		return priceRange;
	}

	public String getPriceRangeText() {
		return priceRangeText;
	}

	public int getCarType() {
		return carType;
	}

	public String getCarTypeText() {
		return carTypeText;
	}

	public int getCarSize() {
		return carSize;
	}

	public String getCarSizeText() {
		return carSizeText;
	}

	public int getManufacturer() {
		return manufacturer;
	}

	public String getManufacturerText() {
		return manufacturerText;
	}

	public int getCarColor() {
		return carColor;
	}

	public String getCarColorText() {
		return carColorText;
	}
    public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public Customer() {
        this.name = "";
        this.phoneNumber = "";
        this.username = "";
        this.password = "";
        this.priceRange = 0;
        this.carType = 0;
        this.carSize = 0;
        this.manufacturer = 0;
        this.carColor = 0;
        this.priceRangeText = "";
        this.carTypeText = "";
        this.carSizeText = "";
        this.manufacturerText = "";
        this.carColorText = "";
        this.cars = new ArrayList<>();
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요. : ");
        this.name = scanner.nextLine();

        System.out.print("전화번호를 입력하세요. : ");
        this.phoneNumber = scanner.nextLine();

        System.out.print("아이디를 입력하세요. : ");
        this.username = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요. : ");
        this.password = scanner.nextLine();
    }
    
    public void pickDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("예약하실 날짜를 입력해주세요. ");

        String input = scanner.nextLine();
        String[] dateParts = input.split("\\s*[/월일]\\s*");

        while (dateParts.length != 2) {
            System.out.println("올바른 날짜를 입력해주세요.");
            input = scanner.nextLine();
            dateParts = input.split("\\s*[/월일]\\s*");
        }

        String month = dateParts[0];
        String date = dateParts[1];

        System.out.println(month + "월 " + date + "일을 선택하셨습니다.");
        this.Date = month + "/" + date;
        setDate(Date);
    }
    
    public void login() {
        System.out.println(username + "님, 안녕하세요!");
    }
    
    public void searchCars() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("차량을 조회합니다.");
        System.out.println("------------------------------------");
        System.out.println("가격대 선택:");
        System.out.println("1. 30,000원 ~ 50,000원");
        System.out.println("2. 50,000원 ~ 100,000원");
        System.out.println("3. 100,000원 ~ 200,000원");

        boolean validInput1 = false;
        while (!validInput1) {
        	priceRange = scanner.nextInt();
            if (priceRange == 1) {
            	priceRangeText = "30,000원 ~ 50,000원";
                validInput1 = true;
            } else if (priceRange == 2) {
            	priceRangeText  = "50,000원 ~ 100,000원";
                validInput1 = true;
            } else if (priceRange == 3) {
            	priceRangeText  = "100,000원 ~ 200,000원";
                validInput1 = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }

        System.out.println(priceRangeText + "를 선택하셨습니다.");

        System.out.println("------------------------------------");
        System.out.println("차량 종류 선택:");
        System.out.println("1. 세단");
        System.out.println("2. SUV");
        System.out.println("3. 승합차");

        boolean validInput2 = false;
        while (!validInput2) {
        	carType = scanner.nextInt();
            if (carType == 1) {
            	carTypeText = "세단";
                validInput2 = true;
            } else if (carType == 2) {
            	carTypeText  = "SUV";
                validInput2 = true;
            } else if (carType == 3) {
            	carTypeText  = "승합차";
                validInput2 = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }

        System.out.println(carTypeText + "를 선택하셨습니다.");

        System.out.println("------------------------------------");
        System.out.println("차량 크기 선택:");
        System.out.println("1. 소형");
        System.out.println("2. 준중형 ~ 중형");
        System.out.println("3. 준대형 ~ 대형");

        boolean validInput3 = false;
        while (!validInput3) {
        	carSize = scanner.nextInt();
            if (carSize == 1) {
            	carSizeText = "소형";
                validInput3 = true;
            } else if (carSize == 2) {
            	carSizeText = "준중형 ~ 중형";
                validInput3 = true;
            } else if (carSize == 3) {
            	carSizeText = "준대형 ~ 대형";
                validInput3 = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }
        System.out.println(carSizeText + "를 선택하셨습니다.");

        System.out.println("------------------------------------");
        System.out.println("제조사 선택:");
        System.out.println("1. 국산차");
        System.out.println("2. 외제차");
        
        boolean validInput4 = false;
        while (!validInput4) {
        	manufacturer = scanner.nextInt();
            if (manufacturer == 1) {
            	manufacturerText = "국산차";
                validInput4 = true;
            } else if (manufacturer == 2) {
            	manufacturerText = "외제차";
                validInput4 = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }
        System.out.println(manufacturerText + "를 선택하셨습니다.");
        
        System.out.println("------------------------------------");
        System.out.println("차량 색상 선택:");
        System.out.println("1. 흰색");
        System.out.println("2. 검은색");

        boolean validInput5 = false;
        while (!validInput5) {
            carColor = scanner.nextInt();
            if (carColor == 1) {
                carColorText = "흰색";
                validInput5 = true;
            } else if (carColor == 2) {
                carColorText = "검은색";
                validInput5 = true;
            } else {
                System.out.println("유효하지 않은 입력입니다. 다시 선택해주세요.");
            }
        }
        System.out.println(carColorText + "를 선택하셨습니다.");
        
        System.out.println("선택하신 조건은 " + priceRangeText +", " + carTypeText + ", " + carSizeText + ", "+ manufacturerText + ", " + carColorText + " 입니다." );
        System.out.println("선택한 조건에 맞는 차량을 조회합니다.");
        // 차량 조회 로직 구현

    }
    
    public List<String> searchCarsWithConditions(int priceRange, int carType, int carSize, int manufacturer, int carColor) {
        
     // 가격대: 30,000원 ~ 50,000원 선택
        if (priceRange == 1) {
        
        cars.add("티볼리");
        cars.add("셀토스");
        }

        // 가격대: 50,000원 ~ 100,000원 선택
        else if (priceRange == 2) {
        cars.add("아반떼");
        cars.add("쏘렌토");
        cars.add("카니발");
        }

        // 가격대: 100,000원 ~ 200,000원 선택
        else if (priceRange == 3) {
        cars.add("제네시스 G80");
        cars.add("벤츠-EQ EQS");
        cars.add("벤츠 G클래스");
        cars.add("BMW 7시리즈");
        cars.add("그랜저");
        }

        // 차량 종류: 세단 선택
        if (carType == 1) {
        cars.retainAll(Arrays.asList("아반떼", "제네시스 G80", "BMW 7시리즈", "그랜저" ));
        }

        // 차량 종류: SUV 선택
        else if (carType == 2) {
        cars.retainAll(Arrays.asList("쏘렌토", "티볼리", "셀토스",  "벤츠-EQ EQS", "벤츠 G클래스" ));
        }

        // 차량 종류: 승합차 선택
        else if (carType == 3) {
        cars.retainAll(Arrays.asList("카니발"));
        }

        // 차량 크기: 소형 선택
        if (carSize == 1) {
        cars.retainAll(Arrays.asList("티볼리", "셀토스"));
        }

        // 차량 크기: 준중형 ~ 중형 선택
        else if (carSize == 2) {
        cars.retainAll(Arrays.asList( "쏘렌토", "제네시스 G80", "벤츠 G클래스", "아반떼"));
        }

        // 차량 크기: 준대형 ~ 대형 선택
        else if (carSize == 3) {
        cars.retainAll(Arrays.asList("제네시스 G80", "BMW 7시리즈", "벤츠-EQ EQS", "카니발", "그랜저" ));
        }

        // 제조사: 국산차 선택
        if (manufacturer == 1) {
        cars.retainAll(Arrays.asList("아반떼", "제네시스 G80", "티볼리", "셀토스", "그랜저", "카니발", "쏘렌토"));
        }

        // 제조사: 외제차 선택
        else if (manufacturer == 2) {
        cars.retainAll(Arrays.asList("벤츠-EQ EQS", "벤츠 G클래스", "BMW 7시리즈"));
        }

        // 차량 색상: 흰색 선택
        if (carColor == 1) {
        cars.retainAll(Arrays.asList("티볼리", "아반떼", "쏘렌토", "제네시스G80", "벤츠-EQ EQS"));
        }

        // 차량 색상: 검은색 선택
        else if (carColor == 2) {
        cars.retainAll(Arrays.asList("셀토스", "그랜저", "카니발", "벤츠 G클래스", "BMW 7시리즈"));
        }

     // 검색 결과 확인
        if (cars.isEmpty()) {
            System.out.println("조건에 해당하는 차량이 없습니다. 다른 조건으로 검색해주세요.");
        } else {
            System.out.println("조건에 해당하는 차량은 " + cars + " 입니다.");
        }
        return cars;
    }

//  public void reserve() {
//  System.out.println("차를 예약했어요!");
//}
//
//public void pay() {
//  System.out.println("차량 이용료는 x 원입니다!");
//}
//
//public void takeBack() {
// System.out.println("차량을 반납했어요!");
//}

}
