package org.joonzis.test;

class Product{
	private String model;
	private int price;
	
	public Product(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
	
}

class Tv extends Product{
	
	public Tv(String model, int price) {
		super(model, price);
	}
}

class Computer extends Product{

	public Computer(String model, int price) {
		super(model, price);
		// TODO 자동 생성된 생성자 스텁
	}
}

class Customer{
	private int money, startMoney, numOfProduct;
	private Product[] cart;
	
	public Customer(int money) {
		this.startMoney = money;
		this.money = money;
		this.cart = new Product[10];
		this.numOfProduct = 0;
	}
	
	public void buy(Product product) throws Exception {
		if(money < product.getPrice()) {
			throw new Exception("금액이 부족합니다." + "\n" + "-------------");
			
		}
		
		money = money - product.getPrice();
		cart[numOfProduct] = product;
		numOfProduct++;
	}
	
	public void output() {
		System.out.println("구매한 상품:");
        int totalSpent = 0;
        for (int i = 0; i < numOfProduct; i++) {
            System.out.println(cart[i].getModel() + " : " + cart[i].getPrice() + "원");
            totalSpent = totalSpent + cart[i].getPrice();
        }
        System.out.println("처음 소지 금액 : " + startMoney + "원");
        System.out.println("총 구매 금액 : " + totalSpent + "원");
        System.out.println("남은 금액 : " + money + "원");
        System.out.println("--------------------");
    }
}


public class Test02 {
    public static void main(String[] args) {
        try {
            // 고객 1명 생성 (소지 금액: 100000원)
            Customer customer1 = new Customer(100000);

            // 업캐스팅: Tv와 Computer 객체를 Product 타입으로 업캐스팅
            Product product1 = new Tv("Samsung TV", 50000);  // Tv -> Product (업캐스팅)
            Product product2 = new Computer("Dell Laptop", 70000);  // Computer -> Product (업캐스팅)

            // 고객 1이 TV를 구매
            customer1.buy(product1);

            // 고객 1이 Laptop을 구매하려고 시도 (금액 부족)
            customer1.buy(product2); // 예외 발생

            // 고객 1의 구매 내역 출력
            customer1.output();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // 고객 2명 생성 (소지 금액: 150000원)
            Customer customer2 = new Customer(150000);
            
            // 제품 생성
            Tv tv = new Tv("LG TV", 60000);
            Computer computer = new Computer("HP Laptop", 80000);

            // 업캐스팅: Tv와 Computer 객체를 Product 타입으로 업캐스팅
            Product product1 = tv;
            Product product2 = computer;

            // 고객 2가 TV와 Laptop을 구매
            customer2.buy(product1);
            customer2.buy(product2);

            // 고객 2의 구매 내역 출력
            customer2.output();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 다운캐스팅 예시
        // 다운캐스팅: Product 타입을 원래의 자식 타입으로 변환
        Product product = new Tv("Sony TV", 45000);  // Tv 객체 생성 후 Product로 업캐스팅
        if (product instanceof Tv) {
        	Tv tvProduct = (Tv) product;  // 다운캐스팅
        	System.out.println("다운캐스팅된 제품: " + tvProduct.getModel());
        }
        
        // 다른 예시: Product -> Computer로 다운캐스팅
        product = new Computer("Asus Laptop", 95000);
        if (product instanceof Computer) {
        	Computer computerProduct = (Computer) product;  // 다운캐스팅
        	System.out.println("다운캐스팅된 제품: " + computerProduct.getModel());
        }
    }
}