package com.odinbilet.carrier.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.odinbilet.carrier.client.UserInfo;
import com.sun.org.apache.xpath.internal.operations.Bool;

@RemoteServiceRelativePath("logon")
public interface LogonService extends RemoteService {
   public UserInfo logon(String user,String password);
}
