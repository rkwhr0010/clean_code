package chap06.ex03;

import java.io.File;

public class Exam02 {
  Context ctxt = new Context();

  void exam1() {
    String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();
  }
  
  void exam2() {
    Options opts = ctxt.getOptions();
    File scratchDir = opts.getScratchDir();
    String outputDir = scratchDir.getAbsolutePath();
  }

  void exam3() {
    String outputDir = ctxt.options.scratchDir.absolutePath;
  }
}
