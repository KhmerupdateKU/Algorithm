package nowcoder;

import java.util.Scanner;

/**
 * �ó��������ж�һ�����Ƿ�Ϊ������������ֱ���������֮�򽫸������Ϊ���ɸ�������˵ĸ�ʽ�� �� 89 ��ֱ����� 89 �� 20 ����� 20 = 2 x
 * 2 x 5
 *
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		primeFactor(scanner);

	}

	private static void primeFactor(Scanner scanner) {

		int prime[] = new int[2000]; // ������������
		int index = 0;

		// ѭ����ȡ
		while (scanner.hasNextInt()) {

			int n = scanner.nextInt();
			// ���� -1 ���˳�ѭ����ȡ��������
			if (n == -1) {
				
				break;
				
			} else if (n == 1) {

				System.out.println("���������1����");

			} else if (isPrime(n)) {

				System.out.println(n);

			} else {

				int input = n;

				for (int i = 2; i <= Math.sqrt(n); i++) {

					if (n % i == 0) {
						prime[index++] = i;
						n = n / i;
						i = 1;
					}

					if (isPrime(n)) {
						prime[index++] = n;
						break;
					}

				}

				// ��ʼ���
				System.out.print(input + " = ");

				for (int i = 0; i < index; i++) {

					if (i == index - 1) {
						System.out.println(prime[i]);
					} else {
						System.out.print(prime[i] + " x ");
					}

				}
			}

			index = 0;

		}

	}

	// �ж�һ�����ǲ�������
	private static boolean isPrime(int n) {

		if (n <= 3 && n != 1) {
			return true;
		} else if (n == 1) {
			return false;
		} else {

			for (int i = 2; i <= Math.sqrt(n); i++) {

				if (n % i == 0) {
					return false;
				}

			}
			return true;
		}

	}

}
