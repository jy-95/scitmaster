package chapter14.exception;

class NetAccess implements AutoCloseable{
	public void open() {System.out.println("접속");}
	public void send() {System.out.println("전송");}
	@Override
	public void close() {System.out.println("해제");}
	
}
public class C127_autoclose {

	public static void main(String[] args) {
		try(NetAccess na = new NetAccess()) {
			na.open();
			na.send();
			//na.close를 따로 호출하지 않아도 Autocloseable을 구현하고 있다면 자동으로 출력됨.
			throw new Exception("err");
		} catch (Exception e) {
			System.out.println("예외처리");
		}
	}

}
