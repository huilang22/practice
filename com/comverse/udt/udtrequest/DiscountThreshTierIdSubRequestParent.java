/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdSubRequestParent.java
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
 * Abstract base class for all DiscountThreshTierId related UdtSubRequestParents
 *
 */
public abstract class DiscountThreshTierIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscountThreshTierIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountThreshTierIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscountThreshTierIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountThreshTierIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscountThreshTierIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscountThreshTierIdSubRequestParent(String id, String method) {
    super(id, "DiscountThreshTierId", method);
  }
}
