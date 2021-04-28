package chapter5;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();
        order.orderNumber = 2018031200001L;
        order.orderId = "abc123";
        order.orderDate= "2018년 3월12일";
        order.orderName = "홍길순";
        order.productNumber = "PD0345-12";
        order.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호:"+order.orderNumber);
        System.out.println("주문자아이디:"+order.orderId);
        System.out.println("주문날짜:"+order.orderDate);
        System.out.println("주문자이름:"+order.orderName);
        System.out.println("주문상품번호:"+order.productNumber);
        System.out.println("배송주소:"+order.address);
    }


}
