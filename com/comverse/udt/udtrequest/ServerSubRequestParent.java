/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerSubRequestParent.java
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
 * Abstract base class for all Server related UdtSubRequestParents
 *
 */
public abstract class ServerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServerSubRequestParent(String id, String method) {
    super(id, "Server", method);
  }
}
