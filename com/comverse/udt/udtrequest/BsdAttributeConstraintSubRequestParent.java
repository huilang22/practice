/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintSubRequestParent.java
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
 * Abstract base class for all BsdAttributeConstraint related UdtSubRequestParents
 *
 */
public abstract class BsdAttributeConstraintSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdAttributeConstraintSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdAttributeConstraintSubRequestParent(String id, String method) {
    super(id, "BsdAttributeConstraint", method);
  }
}
