/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServerDefinition related UdtRequests
 *
 */

public abstract class ServerDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for ServerDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServerDefinitionRequest(String id, String method) {
    super(id, "ServerDefinition", method);
  }
}
