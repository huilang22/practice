/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerMainSubRequestParent.java
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
 * Abstract base class for all InvContainerMain related UdtSubRequestParents
 *
 */
public abstract class InvContainerMainSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvContainerMainRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerMainRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvContainerMainSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvContainerMainSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvContainerMainSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvContainerMainSubRequestParent(String id, String method) {
    super(id, "InvContainerMain", method);
  }
}
