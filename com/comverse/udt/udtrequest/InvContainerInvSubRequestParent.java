/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvSubRequestParent.java
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
 * Abstract base class for all InvContainerInv related UdtSubRequestParents
 *
 */
public abstract class InvContainerInvSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvContainerInvRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerInvRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvContainerInvSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerInvSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvContainerInvSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvContainerInvSubRequestParent(String id, String method) {
    super(id, "InvContainerInv", method);
  }
}
