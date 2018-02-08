/**
 * 
 */
package org.topicquests.os.merge.api;

import org.topicquests.support.api.IResult;

import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public interface IMergeModel {

	/**
	 * Given a new <code>proxy</code>, run tests to decide if
	 * a merge is indicated. If a merge is indicated, that merge is performed
	 * through other methods
	 * @param proxy
	 * @return
	 */
	IResult acceptProxyForMerge(JSONObject proxy);
	
	/**
	 * Given an array of <code>proxiesToMerge</code>, if a <code>virtualProxy</code>
	 * is suppled, merge against it. Otherwise, create a VirtualProxy and merge
	 * against that
	 * @param virtualProxy can be <code>null</code>
	 * @param proxiesToMerge
	 * @return
	 */
	IResult mergeProxies(JSONObject virtualProxy, JSONObject [] proxiesToMerge);
}
