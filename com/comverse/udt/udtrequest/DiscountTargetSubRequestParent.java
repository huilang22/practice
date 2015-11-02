/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetSubRequestParent.java
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
 * Abstract base class for all DiscountTarget related UdtSubRequestParents
 *
 */
public abstract class DiscountTargetSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DiscountTargetRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountTargetRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DiscountTargetSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DiscountTargetSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DiscountTargetSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DiscountTargetSubRequestParent(String id, String method) {
    super(id, "DiscountTarget", method);
  }
}
