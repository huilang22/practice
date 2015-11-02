/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRefSubRequestParent.java
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
 * Abstract base class for all InvsSimCardConfigRef related UdtSubRequestParents
 *
 */
public abstract class InvsSimCardConfigRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimCardConfigRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimCardConfigRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimCardConfigRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimCardConfigRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimCardConfigRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimCardConfigRefSubRequestParent(String id, String method) {
    super(id, "InvsSimCardConfigRef", method);
  }
}
