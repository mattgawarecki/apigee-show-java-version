import com.apigee.flow.execution.ExecutionContext;
import com.apigee.flow.execution.ExecutionResult;
import com.apigee.flow.execution.spi.Execution;
import com.apigee.flow.message.MessageContext;

public class CheckJavaVersion implements Execution {
  public ExecutionResult execute(MessageContext messageContext, ExecutionContext executionContext) {
    try {
      messageContext.setVariable("javaVersion", System.getProperty("java.version"));
      return ExecutionResult.SUCCESS;
    } catch (Exception e) {
      return ExecutionResult.ABORT;
    }
  }
}
