/**
 * 
 */
package devtests;

import org.topicquests.os.merge.MergeAgentEnvironment;

/**
 * @author jackpark
 *
 */
public class BootTest {
	private MergeAgentEnvironment environment;
	/**
	 * 
	 */
	public BootTest() {
		environment = new MergeAgentEnvironment();
		System.out.println("A "+environment.getModel());
		environment.shutDown();
		System.exit(0);
	}

}
