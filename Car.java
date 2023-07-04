package rentCar;

public class Car {
	
	private int priceRange; // 가격
	private String carType; // 차량 종류
	private String carSize; // 차량 크기
	private String manufacturer; //제조사 선택
	private String carColor; // 차량의 색상
	private int modelYear; // 연식
	private double fuelEfficiency; // 연비
	private int horsepower; // 출력
	private String fuelType; // 연료

	
	public Car(int priceRange, String carType, String carSize, String manufacturer, String carColor,int modelYear, double fuelEfficiency, int horsepower, String fuelType) {
		this.carType = carType;
		this.carSize =carSize;
		this.carColor = carColor;
		this.priceRange = priceRange;
		this.manufacturer = manufacturer;
		this.modelYear = modelYear;
        this.fuelEfficiency = fuelEfficiency;
        this.horsepower = horsepower;
        this.fuelType = fuelType;
	}
	public String getcarType() {
		return carType;
	}
	public String getcarSize() {
		return carSize;
	}
	public void setcarSize(String carSize) {
		this.carSize = carSize;
	}
	public String getcarColor() {
		return carColor;
	}
	public void setcarColor(String carColor) {
		this.carColor = carColor;
	}
	public int getpriceRange() {
		return priceRange;
	}
	public void setpriceRange(int priceRange) {
		this.priceRange = priceRange;
	}
	public String getmanufacturer() {
		return manufacturer;
	}
	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getModelYear() {
	    return modelYear;
	    }

	public void setModelYear(int modelYear) {
	    this.modelYear = modelYear;
	    }

	public double getFuelEfficiency() {
	    return fuelEfficiency;
	    }

	public void setFuelEfficiency(double fuelEfficiency) {
	    this.fuelEfficiency = fuelEfficiency;
	    }

	public int getHorsepower() {
	    return horsepower;
	    }

	public void setHorsepower(int horsepower) {
	    this.horsepower = horsepower;
	    }

	public String getFuelType() {
	    return fuelType;
	    }

	public void setFuelType(String fuelType) {
	    this.fuelType = fuelType;
	    }
	    
	public static Car createCarByType(String type) {
		switch (type) {

		case "티볼리":
            return new Car(40000, "SUV", "소형", "국산차", "흰색", 2022, 15.5, 150, "휘발유");
        case "셀토스":
            return new Car(45000, "SUV", "소형", "국산차", "검정색", 2022, 15.0, 170, "휘발유");
        case "그랜저":
            return new Car(100000, "세단", "준대형", "국산차", "검은색", 2022, 12.0, 220, "휘발유");
        case "카니발":
            return new Car(80000, "승합차", "대형", "국산차", "검은색", 2022, 10.5, 190, "경유");
        case "아반떼":
            return new Car(60000, "세단", "준중형", "국산차", "흰색", 2022, 16.0, 140, "휘발유");
        case "쏘렌토":
            return new Car(70000, "SUV", "중형", "국산차", "흰색", 2022, 14.5, 180, "휘발유");
        case "제네시스 G80":
            return new Car(120000, "세단", "준대형", "국산차", "흰색", 2022, 11.5, 250, "휘발유");
        case "벤츠-EQ EQS":
            return new Car(150000, "SUV", "대형", "외제차", "흰색", 2022, 9.5, 280, "전기");
        case "벤츠 G클래스":
            return new Car(200000, "SUV", "중형", "외제차", "블랙", 2022, 10.0, 300, "휘발유");
        case "BMW 7시리즈":
            return new Car(170000, "세단", "대형", "외제차", "블랙", 2022, 11.0, 280, "휘발유");
		default:
			return null;
		}
	}
}
