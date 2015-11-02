/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NetActionSubRequestParent.java
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
 * Abstract base class for all NetAction related UdtSubRequestParents
 *
 */
public abstract class NetActionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NetActionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NetActionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NetActionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NetActionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NetActionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NetActionSubRequestParent(String id, String method) {
    super(id, "NetAction", method);
  }
}
