/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvSubRequestParent.java
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
 * Abstract base class for all InvJobInv related UdtSubRequestParents
 *
 */
public abstract class InvJobInvSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvJobInvRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobInvRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvJobInvSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobInvSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvJobInvSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvJobInvSubRequestParent(String id, String method) {
    super(id, "InvJobInv", method);
  }
}
