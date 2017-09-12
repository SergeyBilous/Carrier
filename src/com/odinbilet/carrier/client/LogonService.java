package com.odinbilet.carrier.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.sun.org.apache.xpath.internal.operations.Bool;

public interface LogonService extends RemoteService {
    Boolean isLoggedIn(String user);
}
