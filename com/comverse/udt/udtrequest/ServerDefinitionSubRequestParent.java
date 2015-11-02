/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServerDefinition related UdtSubRequestParents
 *
 */
public abstract class ServerDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServerDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServerDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServerDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServerDefinitionSubRequestParent(String id, String method) {
    super(id, "ServerDefinition", method);
  }
}
