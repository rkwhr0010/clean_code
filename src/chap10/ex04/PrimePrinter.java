package chap10.ex04;

import java.io.PrintStream;

public class PrimePrinter {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 1000;
		int[] primes = PrimeGenerator.generatePrimes(NUMBER_OF_PRIMES);

		final int ROWS_PER_PAGE = 50;
		final int COLUMNS_PER_PAGE = 4;

		RowColumnPagePrinter tablePrinter = new RowColumnPagePrinter(ROWS_PER_PAGE, COLUMNS_PER_PAGE,
				"The First " + NUMBER_OF_PRIMES + " Prime Numbers");

		tablePrinter.print(primes);
	}
}

class RowColumnPagePrinter {
	private int rowsPerPage;
	private int columnsPerPage;
	private int numbersPerPage;
	private String pageHeader;
	private PrintStream printStream;

	public RowColumnPagePrinter(int rowsPerPage, int columnsPerPage, String pageHeader) {
		this.rowsPerPage = rowsPerPage;
		this.columnsPerPage = columnsPerPage;
		this.pageHeader = pageHeader;

		numbersPerPage = rowsPerPage * columnsPerPage;
		printStream = System.out;
	}

	public void print(int[] data) {
		int pageNumber = 1;
		for (int firstIndexOnPage = 0; firstIndexOnPage < data.length; firstIndexOnPage += numbersPerPage) {
			int lastIndexOnPage = Math.min(firstIndexOnPage + numbersPerPage - 1, data.length - 1);

			printPageHeader(pageHeader, pageNumber);
			printPage(firstIndexOnPage, lastIndexOnPage, data);
		}
	}

	private void printPage(int firstIndexOnPage, int lastIndexOnPage, int[] data) {
		int firstIndexOfLastRowOnPage = firstIndexOnPage + rowsPerPage - 1;
		for (int firstIndexInRow = firstIndexOnPage; firstIndexInRow <= firstIndexOfLastRowOnPage; firstIndexInRow++) {
			printRow(firstIndexInRow, lastIndexOnPage, data);
			printStream.println("");
		}
	}

	private void printRow(int firstIndexInRow, int lastIndexOnPage, int[] data) {
		for (int column = 0; column < columnsPerPage; column++) {
			int index = firstIndexInRow + column * rowsPerPage;
			if (index <= lastIndexOnPage) {
				printStream.format("%10d", data[index]);
			}
		}
	}

	private void printPageHeader(String pageHeader, int pageNumber) {
		printStream.println(pageHeader + " --- Page " + pageNumber);
		printStream.println("");
	}

	public void setOutput(PrintStream printStream) {
		this.printStream = printStream;
	}
}

class PrimeGenerator {
	private static boolean[] crossedOut;
	private static int[] result;

	public static int[] generatePrimes(int maxValue) {
		if (maxValue < 2) {
			return new int[0];
		} else {
			uncrossIntegersUpTo(maxValue);
			crossOutMultiples();
			putUncrossedIntegersIntoResult();
			return result;
		}
	}

	private static void uncrossIntegersUpTo(int maxValue) {
		crossedOut = new boolean[maxValue + 1];
		for (int i = 2; i < crossedOut.length; i++) {
			crossedOut[i] = false;
		}
	}

	private static void crossOutMultiples() {
		int limit = determineIterationLimit();
		for (int i = 2; i <= limit; i++) {
			if (notCrossed(i)) {
				crossOutMultiplesOf(i);
			}
		}
	}

	private static int determineIterationLimit() {
		/*
		 * 배열에 있는 모든 배수는 배열의 제곱근보다 작은 소수의 인수다. 따라서 이 제곱근보다 더 큰 숫자의 배수는 제거할 필요가 없다.
		 */
		double iterationLimit = Math.sqrt(crossedOut.length);
		return (int) iterationLimit;
	}

	private static void crossOutMultiplesOf(int i) {
		for (int multiple = 2 * i; multiple < crossedOut.length; multiple += i) {
			crossedOut[multiple] = true;
		}
	}

	private static boolean notCrossed(int i) {
		return crossedOut[i] == false;
	}

	private static void putUncrossedIntegersIntoResult() {
		result = new int[numberOfUncrossedIntegers()];
		for (int j = 0, i = 2; i < crossedOut.length; i++) {
			if (notCrossed(i)) {
				result[j++] = i;
			}
		}
	}

	private static int numberOfUncrossedIntegers() {
		int count = 0;
		for (int i = 2; i < crossedOut.length; i++) {
			if (notCrossed(i)) {
				count++;
			}
		}

		return count;
	}
}
