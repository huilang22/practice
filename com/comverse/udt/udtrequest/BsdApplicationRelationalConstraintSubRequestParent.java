/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalConstraintSubRequestParent.java
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
 * Abstract base class for all BsdApplicationRelationalConstraint related UdtSubRequestParents
 *
 */
public abstract class BsdApplicationRelationalConstraintSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdApplicationRelationalConstraintRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationRelationalConstraintRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdApplicationRelationalConstraintSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationRelationalConstraintSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdApplicationRelationalConstraintSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdApplicationRelationalConstraintSubRequestParent(String id, String method) {
    super(id, "BsdApplicationRelationalConstraint", method);
  }
}
