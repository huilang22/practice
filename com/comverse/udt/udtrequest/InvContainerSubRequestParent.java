/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerSubRequestParent.java
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
 * Abstract base class for all InvContainer related UdtSubRequestParents
 *
 */
public abstract class InvContainerSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvContainerRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvContainerSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvContainerSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvContainerSubRequestParent(String id, String method) {
    super(id, "InvContainer", method);
  }
}
