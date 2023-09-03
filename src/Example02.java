import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Example02 {}

class Ex001 {
    void 의도를분명히밝혀라(){
        /**
         * 주석이 필요하면 의도가 명확하지 않은 것
         */
        Date d; // 도착시간
        
        /**
         * 의도는 명확히
         */
        Date arrivalTime;
    }
}

class Ex002 {
    List<int[]> theList = new ArrayList<>();

    public List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<>();
        // theList 내용물이 뭐지?
        theList.stream()
            .filter(intArr -> intArr[0] == 4) // intArr[0] == 4 는 뭐지?
            .forEach(intArr -> list1.add(intArr));
        //반환되는 리스트는 어떻게 사용하지?
        return list1;
    }
}

class Ex002_2 {
    //지뢰찾기 게임이라는 것을 알아냈다.
    private static final int FLAGGED = 4;
    private static final int STATUS_VALUE = 0;

    List<int[]> gameBoard = new ArrayList<>();

    public List<int[]> getFlaggedCells(){
        List<int[]> flaggedCells = new ArrayList<>();
        gameBoard.stream()
            .filter(cell -> cell[STATUS_VALUE] == FLAGGED) 
            .forEach(flaggedCells::add);
            
        return flaggedCells;
    }
}

class Ex002_3 {
    List<Cell> gameBoard = new ArrayList<>();

    public List<Cell> getFlaggedCells(){
        List<Cell> flaggedCells = new ArrayList<>();

        gameBoard.stream()
            .filter(Cell::isFlagged) 
            .forEach(flaggedCells::add);
            
        return flaggedCells;
    }

    class Cell {
        private int[] status;
        private static final int FLAGGED = 4;
        private static final int STATUS_VALUE = 0;

        public boolean isFlagged() {
            return FLAGGED == status[STATUS_VALUE];
        }
    }
}

//그릇된 정보를 피하라
class Ex003 {
    //자료구조와 관련된 이름 조심히
    class Account {}

    class AccountList{} // 안 좋은 이름 마치 List를 구현한 것 처럼 느껴진다.

    //GOOD
    class AccountGroup{}
    class Accouts{}
}

class Ex003_2 {
    void exam(){
        //아무 의미없는 임시 변수명 지양
        int a = 0;
        int b = 1;
        if(a == b) {
            a = 10;
        }
    }
    void exam2(){
        //아무 의미없는 임시 변수명에, 비슷한 철자까지 더 하면 더 끔찍하다.
        int i = 0;
        int l = 1;
        int I = 2;
    }
    void exam3(){
        //보통 기업들 코딩 컨벤션을 보면, 임시 변수는 아래와 같이
        //반복문에 같은 곳에만 허용한다.
        for(int i = 0; i < 10; i++){

        }
    }
}
//의미 있게 구분하라
class Ex004 {
    //나쁜 이름
    public static void copyChars(char[] a1, char[] a2){
        for(int i = 0; i < a1.length; i++){
            a2[i] = a1[i];
        }
    }
}
class Ex004_2 {
    //의미가 분명한 좋은 이름
    public static void copyChars(char[] source, char[] destination){
        for(int i = 0; i < source.length; i++){
            destination[i] = source[i];
        }
    }
}

//발음하기 쉬운 이름을 사용하라
class Ex005 {
    //안 좋은 예
    private Date modymdhms; //y년, m월, d일, h시, m분, s초;
    //좋은 예
    private Date modificationTimestamp;
}

/*
 * 검색하기 쉬운 이름을 사용하라
 */
class Ex006 {
    void bad() {
        //예시 용 변수
        int s = 0;
        int[] t = null;

        for (int j = 0; j < 34; j++ ) {
            s += (t[j] * 4 ) / 5;
        }
    }
}
class Ex006_2 {
    int good() {
        //예시 용 변수
        int[] taskEstimate = new int[0];
        int realDaysPerIdealDay = 4;
        final int WORK_DAYS_PER_WEEK = 5;
        int sum = 0;

        for (int j = 0; j < WORK_DAYS_PER_WEEK; j++ ) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }

        return sum;
    }
}
/*
 * 말장난을 하지마라
 */
class Ex007 {
    //다른 곳도, add 어휘 메서드는 무언 가를 더한 값을 리턴한다.
    int add(int left, int right) {
        return left + right;
    }
    //무언가 컨테이너에 값을 더하는 메서드가 필요해서
    //구현하고 이름을 add로 지으면, 기존 add 어휘가 가지는 의미가 두 개가 된다.
    List<Object> list;
    void add(Object obj){
        list.add(obj);
    }
    //add 어휘에 일관성을 지키기 위해 insert라는 이름으로 바꾼다.
    void insert(Object obj){
        list.add(obj);
    }
}
