/**
 * 
 */
package comrel.extensions;

import comrel.MultiInputPort;
import comrel.MultiOutputPort;

/**
 * @author arendt
 *
 */
public interface IMultiFilterHelper {
	
	public MultiInputPort getInputPort();
	
	public MultiOutputPort getOutputPort();
	
	public void run();

}
