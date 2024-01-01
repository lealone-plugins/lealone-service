/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.service.http;

import com.lealone.server.ProtocolServerEngineBase;

public abstract class HttpServerEngine extends ProtocolServerEngineBase {

    public static final String NAME = "vertx";

    public HttpServerEngine(String name) {
        super(name);
    }

}
