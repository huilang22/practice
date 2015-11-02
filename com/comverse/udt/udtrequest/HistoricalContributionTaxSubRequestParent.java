/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionTaxSubRequestParent.java
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
 * Abstract base class for all HistoricalContributionTax related UdtSubRequestParents
 *
 */
public abstract class HistoricalContributionTaxSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HistoricalContributionTaxRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HistoricalContributionTaxRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HistoricalContributionTaxSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HistoricalContributionTaxSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HistoricalContributionTaxSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HistoricalContributionTaxSubRequestParent(String id, String method) {
    super(id, "HistoricalContributionTax", method);
  }
}
