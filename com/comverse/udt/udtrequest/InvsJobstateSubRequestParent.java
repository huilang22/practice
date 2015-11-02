/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstateSubRequestParent.java
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
 * Abstract base class for all InvsJobstate related UdtSubRequestParents
 *
 */
public abstract class InvsJobstateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsJobstateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobstateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsJobstateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobstateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsJobstateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsJobstateSubRequestParent(String id, String method) {
    super(id, "InvsJobstate", method);
  }
}
