package chap07.ex02;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
  Storage sectionStore;

  @Test(expected = StorageException.class)
  public void retrieveSectionShouldThrowOnInvalidFileName() {
    sectionStore.retrieveSection("invlid - file");
  }

  public List<RecordedGrip> retrieveSection(String sectionName) {
    //실제로 구현할 때까지 비어 있는 더미를 반환한다.
    return new ArrayList<RecordedGrip>();
  }
}
