package runPythonScript.main;

import java.io.StringWriter;
import java.util.logging.Logger;

import org.python.util.PythonInterpreter;

public class Main {
  private static final Logger LOGGER = Logger.getLogger(Class.class.getName());

  public static void main(String[] args) {
    String a_Script = args[0];
    PythonInterpreter.initialize(System.getProperties(), System.getProperties(), args);
    org.python.util.PythonInterpreter python = new org.python.util.PythonInterpreter();
    StringWriter out = new StringWriter();
    python.setOut(out);
    python.execfile(a_Script);
    String outputStr = out.toString();
    LOGGER.info(outputStr);
  }
}
