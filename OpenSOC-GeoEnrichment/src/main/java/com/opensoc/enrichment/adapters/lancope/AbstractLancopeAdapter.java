package com.opensoc.enrichments.lancope.adapters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.enrichments.common.EnrichmentAdapter;

public abstract class AbstractLancopeAdapter implements EnrichmentAdapter{

	protected static final Logger LOG = LoggerFactory
			.getLogger(AbstractLancopeAdapter.class);
	
	abstract public boolean initializeAdapter();


}