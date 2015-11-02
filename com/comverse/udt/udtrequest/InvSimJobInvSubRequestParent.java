/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimJobInvSubRequestParent.java
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
 * Abstract base class for all InvSimJobInv related UdtSubRequestParents
 *
 */
public abstract class InvSimJobInvSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvSimJobInvRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimJobInvRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvSimJobInvSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimJobInvSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvSimJobInvSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvSimJobInvSubRequestParent(String id, String method) {
    super(id, "InvSimJobInv", method);
  }
}
