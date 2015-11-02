/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeSubRequestParent.java
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
 * Abstract base class for all BsdAttributeConstraintType related UdtSubRequestParents
 *
 */
public abstract class BsdAttributeConstraintTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdAttributeConstraintTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeConstraintTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdAttributeConstraintTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdAttributeConstraintTypeSubRequestParent(String id, String method) {
    super(id, "BsdAttributeConstraintType", method);
  }
}
