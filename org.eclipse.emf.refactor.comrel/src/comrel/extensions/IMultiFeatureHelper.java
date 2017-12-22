/**
 * 
 */
package comrel.extensions;

import comrel.MultiOutputPort;
import comrel.SingleInputPort;

/**
 * @author arendt
 *
 */
public interface IMultiFeatureHelper {
	
	
	
	public SingleInputPort getInputPort();
	
	public MultiOutputPort getOutputPort();
	
	public void run();

}
