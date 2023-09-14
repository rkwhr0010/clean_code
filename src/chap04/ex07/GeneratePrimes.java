package chap04.ex07;
/**
 * 이 클래스는 사용자가 지정한 최대 값까지 소수를 생성한다.
 * 사용된 알고리즘은 에라스토테네스의 체다.
 * 
 * 에라스토테네스 소개  [의미없는 주석]
 * ~~~~~~~~~~~~~~~~~~
 * 
 * 알고리즘 설명 
 * ~~~~~~~~~~~~~~~~~~
 * 
 * @author 누군가
 * @version 2023.09.01
 */
public class GeneratePrimes {
  /** [의미없는 주석]
   * @param maxValue는 소수를 찾아낼 최대 값 
   */
  //지나지게 거대한 메서드
  public static int[] generatePrimes(int maxValue) {
    if (maxValue > 2) { //유일하게 유효한 경우 [의미없는 주석]
      //선언
      int s = maxValue + 1;
      boolean[] f = new boolean[s];
      int i;

      //배열을 참으로 초기화 [의미없는 주석] 메서드로 뺄 것(메서드 이름을 명시적으로)
      for(i = 0; i < s; i++) {
        f[i] = true;
      }

      //소수가 아닌 알려진 숫자를 제거 [의미없는 주석]
      f[0] = f[1] = false;

      //체 [의미없는 주석] [의미없는 주석] 메서드로 뺄 것(메서드 이름을 명시적으로)
      int j;
      for (i = 2; i < Math.sqrt(s) + 1; i++) {
        if (f[i]) {
          for (j = 2 * i; j < s; j += i) {
            f[j] = false; //배수는 소수가 아니다.
          }
        }
      }

      //소수 개수는? [의미없는 주석] 메서드로 뺄 것(메서드 이름을 명시적으로)
      int count = 0;
      for (i = 0; i < s; i++) {
        if (f[i]) {
          count++; // 카운트 증가
        }
      }
      
      int[] primes = new int[count];

      // 소수를 결과 배열로 이동한다. [의미없는 주석] 메서드로 뺄 것(메서드 이름을 명시적으로)
      for (i = 0, j = 0; i < s; i++) {
        if (f[i]) {
          primes[j++] = i;
        }
      }

      return primes;
    } else { // maxValue < 2 [의미없는 주석]
      return new int[0]; //입력이 잘못되면 비어 있는 배열을 반환하다. [의미없는 주석]
    }
  }
}
