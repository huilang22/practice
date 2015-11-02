/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HistoricalContributionRequestMethod implements UdtMethod {
  private String method = null;
  private HistoricalContributionRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HistoricalContributionCreate method */
  public static final HistoricalContributionRequestMethod HISTORICAL_CONTRIBUTION_CREATE = new HistoricalContributionRequestMethod("HistoricalContributionCreate");
  /** Variable representing the HistoricalContributionFind method */
  public static final HistoricalContributionRequestMethod HISTORICAL_CONTRIBUTION_FIND = new HistoricalContributionRequestMethod("HistoricalContributionFind");
  /** Variable representing the HistoricalContributionGet method */
  public static final HistoricalContributionRequestMethod HISTORICAL_CONTRIBUTION_GET = new HistoricalContributionRequestMethod("HistoricalContributionGet");
  /** Variable representing the HistoricalContributionUpdate method */
  public static final HistoricalContributionRequestMethod HISTORICAL_CONTRIBUTION_UPDATE = new HistoricalContributionRequestMethod("HistoricalContributionUpdate");
}
