/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeConstraintSubRequestParent.java
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
 * Abstract base class for all BsdApplicationAttributeConstraint related UdtSubRequestParents
 *
 */
public abstract class BsdApplicationAttributeConstraintSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdApplicationAttributeConstraintRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationAttributeConstraintRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdApplicationAttributeConstraintSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationAttributeConstraintSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdApplicationAttributeConstraintSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdApplicationAttributeConstraintSubRequestParent(String id, String method) {
    super(id, "BsdApplicationAttributeConstraint", method);
  }
}
