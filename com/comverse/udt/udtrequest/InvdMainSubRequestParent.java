/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainSubRequestParent.java
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
 * Abstract base class for all InvdMain related UdtSubRequestParents
 *
 */
public abstract class InvdMainSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdMainRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdMainSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdMainSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdMainSubRequestParent(String id, String method) {
    super(id, "InvdMain", method);
  }
}
