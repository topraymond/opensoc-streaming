/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.opensoc.enrichment.adapters.whois;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HConnection;
import org.apache.hadoop.hbase.client.HConnectionManager;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Result;
import org.json.simple.JSONObject;

public class WhoisHBaseAdapter extends AbstractWhoisAdapter {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3371873619030870389L;
	private HTableInterface table;
	private String _table_name;
	private String _quorum;
	private String _port;
	
	public WhoisHBaseAdapter(String table_name, String quorum, String port)
	{
		_table_name=table_name;
		_quorum=quorum;
		_port=port;
	}
	
	public boolean initializeAdapter() {
	/*	Configuration conf = null;
		conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", _quorum);
		conf.set("hbase.zookeeper.property.clientPort", _port);
		conf.set("zookeeper.session.timeout", "20");
		conf.set("hbase.rpc.timeout", "20");
		conf.set("zookeeper.recovery.retry", "1");
		conf.set("zookeeper.recovery.retry.intervalmill", "1");
		

		try {
			
			LOG.debug("=======Connecting to HBASE===========");
			LOG.debug("=======ZOOKEEPER = "+ conf.get("hbase.zookeeper.quorum"));
			
			System.out.println("--------CONNECTING TO HBASE WITH: " + conf);
			
			HConnection connection = HConnectionManager.createConnection(conf);

			
			System.out.println("--------CONNECTED TO HBASE");
			
			table = connection.getTable(_table_name);
		

			System.out.println("--------CONNECTED TO TABLE: " + table);
			
			JSONObject tester = enrich("cisco.com");
			
			if(tester.keySet().size() == 0)
				throw new IOException("Either HBASE is misconfigured or whois table is missing");
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return false; */
		
		return true;

	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public JSONObject enrich(String metadata) {
		
		/*LOG.debug("=======Pinging HBase For:" + metadata);
		
		System.out.println("--------HBASE WHOIS LOOKUP: " + metadata);
		
		JSONObject output = new JSONObject();
		JSONObject payload = new JSONObject();

		Get get = new Get(metadata.getBytes());
		Result rs;

		try {
			rs = table.get(get);

			for (KeyValue kv : rs.raw())
				payload.put(metadata, new String(kv.getValue()));
			
			output.put("whois", payload);

		} catch (IOException e) {
			output.put(metadata, "{}");
			e.printStackTrace();
		}
		
		return output;*/
		
		JSONObject output = new JSONObject();

		return output;
		

	}
		
		
}
