package chap07.ex02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exam01 {
  Storage sectionStore;

  @Test(expected = StorageException.class)
  public void retrieveSectionShouldThrowOnInvalidFileName() {
    sectionStore.retrieveSection("invlid - file");
  }

  public List<RecordedGrip> retrieveSection(String sectionName)
      throws StorageException {
    try {//sectionName 잘못된 파일 경로 일부러 넣음
      FileInputStream stream = new FileInputStream(sectionName);
    } catch (Exception e) {
      throw new StorageException("retrieval error", e);
    }
    return new ArrayList<RecordedGrip>();
  }
}
