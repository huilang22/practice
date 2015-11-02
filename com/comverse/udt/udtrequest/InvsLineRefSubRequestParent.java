/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineRefSubRequestParent.java
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
 * Abstract base class for all InvsLineRef related UdtSubRequestParents
 *
 */
public abstract class InvsLineRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLineRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLineRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLineRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLineRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLineRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLineRefSubRequestParent(String id, String method) {
    super(id, "InvsLineRef", method);
  }
}
