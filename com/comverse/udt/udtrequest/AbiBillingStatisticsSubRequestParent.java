/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsSubRequestParent.java
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
 * Abstract base class for all AbiBillingStatistics related UdtSubRequestParents
 *
 */
public abstract class AbiBillingStatisticsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AbiBillingStatisticsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiBillingStatisticsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AbiBillingStatisticsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiBillingStatisticsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AbiBillingStatisticsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AbiBillingStatisticsSubRequestParent(String id, String method) {
    super(id, "AbiBillingStatistics", method);
  }
}
