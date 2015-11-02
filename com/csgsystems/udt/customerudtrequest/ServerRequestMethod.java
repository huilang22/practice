/*
 * Generated code DO NOT EDIT
 * Generated file: ServerRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServerRequestMethod implements UdtMethod {
  private String method = null;
  private ServerRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServerCreate method */
  public static final ServerRequestMethod SERVER_CREATE = new ServerRequestMethod("ServerCreate");
  /** Variable representing the ServerDelete method */
  public static final ServerRequestMethod SERVER_DELETE = new ServerRequestMethod("ServerDelete");
  /** Variable representing the ServerFind method */
  public static final ServerRequestMethod SERVER_FIND = new ServerRequestMethod("ServerFind");
  /** Variable representing the ServerGet method */
  public static final ServerRequestMethod SERVER_GET = new ServerRequestMethod("ServerGet");
  /** Variable representing the ServerUpdate method */
  public static final ServerRequestMethod SERVER_UPDATE = new ServerRequestMethod("ServerUpdate");
}
