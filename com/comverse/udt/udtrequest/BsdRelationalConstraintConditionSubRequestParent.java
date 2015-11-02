/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionSubRequestParent.java
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
 * Abstract base class for all BsdRelationalConstraintCondition related UdtSubRequestParents
 *
 */
public abstract class BsdRelationalConstraintConditionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdRelationalConstraintConditionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalConstraintConditionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdRelationalConstraintConditionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalConstraintConditionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdRelationalConstraintConditionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdRelationalConstraintConditionSubRequestParent(String id, String method) {
    super(id, "BsdRelationalConstraintCondition", method);
  }
}
