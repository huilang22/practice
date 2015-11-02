/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionSubRequestParent.java
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
 * Abstract base class for all DiscountRestriction related UdtSubRequestParents
 *
 */
public abstract class DiscountRestrictionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscountRestrictionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountRestrictionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscountRestrictionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountRestrictionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscountRestrictionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscountRestrictionSubRequestParent(String id, String method) {
    super(id, "DiscountRestriction", method);
  }
}
