/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillingFrequencySubRequestParent.java
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
 * Abstract base class for all BillingFrequency related UdtSubRequestParents
 *
 */
public abstract class BillingFrequencySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillingFrequencyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillingFrequencyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillingFrequencySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillingFrequencySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillingFrequencySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillingFrequencySubRequestParent(String id, String method) {
    super(id, "BillingFrequency", method);
  }
}
