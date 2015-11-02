/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsOperatorSubRequestParent.java
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
 * Abstract base class for all InvsOperator related UdtSubRequestParents
 *
 */
public abstract class InvsOperatorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsOperatorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsOperatorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsOperatorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsOperatorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsOperatorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsOperatorSubRequestParent(String id, String method) {
    super(id, "InvsOperator", method);
  }
}
