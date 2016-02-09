package com.pannous.es.reindex;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.common.logging.ESLogger;
import org.elasticsearch.common.logging.Loggers;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.rest.RestModule;

/**
 * @author Peter Karich
 */
public class ReIndexPlugin extends Plugin {
    
    protected final ESLogger logger = Loggers.getLogger(ReIndexPlugin.class);

    @Override public String name() {
        return "reindex";
    }

    @Override public String description() {
        return "ReIndex Plugin";
    }

    public void onModule(final RestModule module) {
    	module.addRestAction(ReIndexAction.class);
    	module.addRestAction(ReIndexWithCreate.class);
    }

}
