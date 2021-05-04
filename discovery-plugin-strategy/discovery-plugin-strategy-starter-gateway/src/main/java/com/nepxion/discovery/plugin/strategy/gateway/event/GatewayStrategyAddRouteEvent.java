package com.nepxion.discovery.plugin.strategy.gateway.event;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.io.Serializable;

import com.nepxion.discovery.plugin.strategy.gateway.entity.GatewayStrategyRouteEntity;

public class GatewayStrategyAddRouteEvent implements Serializable {
    private static final long serialVersionUID = -5614788825646267155L;

    private GatewayStrategyRouteEntity gatewayStrategyRouteEntity;

    public GatewayStrategyAddRouteEvent(GatewayStrategyRouteEntity gatewayStrategyRouteEntity) {
        this.gatewayStrategyRouteEntity = gatewayStrategyRouteEntity;
    }

    public GatewayStrategyRouteEntity getGatewayStrategyRouteEntity() {
        return gatewayStrategyRouteEntity;
    }
}