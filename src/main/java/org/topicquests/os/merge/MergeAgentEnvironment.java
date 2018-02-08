/**
 * 
 */
package org.topicquests.os.merge;

import org.topicquests.ks.SystemEnvironment;
import org.topicquests.os.merge.api.IMergeModel;
import org.topicquests.support.RootEnvironment;

/**
 * @author jackpark
 *
 */
public class MergeAgentEnvironment extends RootEnvironment {
	private SystemEnvironment topicMapEnvironment;
	private IMergeModel model;

	/**
	 * 
	 */
	public MergeAgentEnvironment() {
		super("merge-config.xml", "logger.properties");
		topicMapEnvironment = new SystemEnvironment();
		model = new MergeModel(this);
		
	}

	public SystemEnvironment getTopicMapEnvironment() {
		return topicMapEnvironment;
	}
	
	public IMergeModel getModel() {
		return model;
	}
	public void shutDown() {
		topicMapEnvironment.shutDown();
	}
}
