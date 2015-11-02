/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeSubRequestParent.java
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
 * Abstract base class for all RbrDecisionTree related UdtSubRequestParents
 *
 */
public abstract class RbrDecisionTreeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrDecisionTreeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrDecisionTreeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrDecisionTreeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrDecisionTreeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrDecisionTreeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrDecisionTreeSubRequestParent(String id, String method) {
    super(id, "RbrDecisionTree", method);
  }
}
