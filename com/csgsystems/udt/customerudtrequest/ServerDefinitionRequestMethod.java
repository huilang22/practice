/*
 * Generated code DO NOT EDIT
 * Generated file: ServerDefinitionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServerDefinitionRequestMethod implements UdtMethod {
  private String method = null;
  private ServerDefinitionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServerDefinitionCreate method */
  public static final ServerDefinitionRequestMethod SERVER_DEFINITION_CREATE = new ServerDefinitionRequestMethod("ServerDefinitionCreate");
  /** Variable representing the ServerDefinitionDelete method */
  public static final ServerDefinitionRequestMethod SERVER_DEFINITION_DELETE = new ServerDefinitionRequestMethod("ServerDefinitionDelete");
  /** Variable representing the ServerDefinitionFind method */
  public static final ServerDefinitionRequestMethod SERVER_DEFINITION_FIND = new ServerDefinitionRequestMethod("ServerDefinitionFind");
  /** Variable representing the ServerDefinitionGet method */
  public static final ServerDefinitionRequestMethod SERVER_DEFINITION_GET = new ServerDefinitionRequestMethod("ServerDefinitionGet");
  /** Variable representing the ServerDefinitionUpdate method */
  public static final ServerDefinitionRequestMethod SERVER_DEFINITION_UPDATE = new ServerDefinitionRequestMethod("ServerDefinitionUpdate");
}
