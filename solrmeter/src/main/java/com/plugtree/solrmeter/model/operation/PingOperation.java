package com.plugtree.solrmeter.model.operation;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.SolrPingResponse;
import org.apache.solr.common.SolrException;

import com.plugtree.solrmeter.model.exception.PingNotConfiguredException;

/**
 * Operation that executes one ping to a SolrServer
 * @author tflobbe
 *
 */
public class PingOperation implements Operation {
	
	private final HttpSolrClient server;
	
	public PingOperation(HttpSolrClient server) {
		this.server = server;
	}

	@Override
	public boolean execute() throws PingNotConfiguredException {
		try {
			SolrPingResponse response = server.ping();
			if(response.getStatus() == 0) {
				return true;
			}
		} catch (SolrServerException | IOException e) {
			return false;
		} catch (SolrException e) {
			if(e.getMessage().startsWith("pingQuery_not_configured")) {
				throw new PingNotConfiguredException("Ping command is not configured on server.");
			}
			return false;
		}
		return false;
	}

}
