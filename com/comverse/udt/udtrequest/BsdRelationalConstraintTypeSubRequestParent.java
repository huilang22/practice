/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeSubRequestParent.java
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
 * Abstract base class for all BsdRelationalConstraintType related UdtSubRequestParents
 *
 */
public abstract class BsdRelationalConstraintTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdRelationalConstraintTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalConstraintTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdRelationalConstraintTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalConstraintTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdRelationalConstraintTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdRelationalConstraintTypeSubRequestParent(String id, String method) {
    super(id, "BsdRelationalConstraintType", method);
  }
}
