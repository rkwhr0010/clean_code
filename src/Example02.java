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