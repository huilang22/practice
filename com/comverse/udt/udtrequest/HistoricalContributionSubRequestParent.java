/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HistoricalContributionSubRequestParent.java
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
 * Abstract base class for all HistoricalContribution related UdtSubRequestParents
 *
 */
public abstract class HistoricalContributionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on HistoricalContributionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HistoricalContributionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on HistoricalContributionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(HistoricalContributionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for HistoricalContributionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public HistoricalContributionSubRequestParent(String id, String method) {
    super(id, "HistoricalContribution", method);
  }
}
