/**
 * 
 */
package org.topicquests.os.merge;

import org.topicquests.os.merge.api.IMergeModel;
import org.topicquests.support.ResultPojo;
import org.topicquests.support.api.IResult;

import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public class MergeModel implements IMergeModel {
	private MergeAgentEnvironment environment;
	/**
	 * 
	 */
	public MergeModel(MergeAgentEnvironment env) {
		environment = env;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.merge.api.IMergeModel#acceptProxyForMerge(net.minidev.json.JSONObject)
	 */
	@Override
	public IResult acceptProxyForMerge(JSONObject proxy) {
		IResult result = new ResultPojo();
		// TODO Auto-generated method stub
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.os.merge.api.IMergeModel#mergeProxies(net.minidev.json.JSONObject, net.minidev.json.JSONObject[])
	 */
	@Override
	public IResult mergeProxies(JSONObject virtualProxy, JSONObject[] proxiesToMerge) {
		IResult result = new ResultPojo();
		// TODO Auto-generated method stub
		return result;
	}

}
