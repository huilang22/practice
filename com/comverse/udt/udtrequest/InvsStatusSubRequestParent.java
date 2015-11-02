/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusSubRequestParent.java
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
 * Abstract base class for all InvsStatus related UdtSubRequestParents
 *
 */
public abstract class InvsStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsStatusSubRequestParent(String id, String method) {
    super(id, "InvsStatus", method);
  }
}
