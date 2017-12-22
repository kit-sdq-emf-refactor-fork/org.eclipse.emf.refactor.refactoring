/**
 * 
 */
package comrel.extensions;

import comrel.SingleInputPort;
import comrel.SingleOutputPort;

/**
 * @author arendt
 *
 */
public interface ISingleFeatureHelper {
	
	public SingleInputPort getInputPort();
	
	public SingleOutputPort getOutputPort();
	
	public void run();

}
