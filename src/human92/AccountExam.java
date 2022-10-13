package human92;

public class AccountExam {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.printf("현재잔고 : %d \n", account.getBalance());
		account.setBalance(-100);
		System.out.printf("현재잔고 : %d \n", account.getBalance());
		account.setBalance(100000);
		System.out.printf("현재잔고 : %d \n", account.getBalance());

	}

}
