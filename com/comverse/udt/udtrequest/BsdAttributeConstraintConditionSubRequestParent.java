/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionSubRequestParent.java
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
 * Abstract base class for all BsdAttributeConstraintCondition related UdtSubRequestParents
 *
 */
public abstract class BsdAttributeConstraintConditionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintConditionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintConditionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintConditionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintConditionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdAttributeConstraintConditionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdAttributeConstraintConditionSubRequestParent(String id, String method) {
    super(id, "BsdAttributeConstraintCondition", method);
  }
}
