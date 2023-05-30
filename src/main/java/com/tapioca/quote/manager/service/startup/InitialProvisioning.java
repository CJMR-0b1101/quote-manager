package com.tapioca.quote.manager.service.startup;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.servlet.ServletContext;

import com.tapioca.quote.manager.service.ProvisioningService;

@ApplicationScoped
public class InitialProvisioning {
	
    @Inject
    private ProvisioningService provisioningService;

    public void onStart(@Observes @Initialized(ApplicationScoped.class) final ServletContext context) {
        provisioningService.refresh();
    }
}