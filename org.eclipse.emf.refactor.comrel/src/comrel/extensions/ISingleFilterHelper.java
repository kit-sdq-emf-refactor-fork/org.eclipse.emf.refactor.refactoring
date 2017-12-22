/**
 * 
 */
package comrel.extensions;

import comrel.MultiInputPort;
import comrel.SingleOutputPort;

/**
 * @author arendt
 *
 */
public interface ISingleFilterHelper {
	
	public MultiInputPort getInputPort();
	
	public SingleOutputPort getOutputPort();
	
	public void run();
	
}
