/*
 * Generated code DO NOT EDIT
 * Generated file: HistoricalContributionTaxRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class HistoricalContributionTaxRequestMethod implements UdtMethod {
  private String method = null;
  private HistoricalContributionTaxRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the HistoricalContributionTaxCreate method */
  public static final HistoricalContributionTaxRequestMethod HISTORICAL_CONTRIBUTION_TAX_CREATE = new HistoricalContributionTaxRequestMethod("HistoricalContributionTaxCreate");
  /** Variable representing the HistoricalContributionTaxFind method */
  public static final HistoricalContributionTaxRequestMethod HISTORICAL_CONTRIBUTION_TAX_FIND = new HistoricalContributionTaxRequestMethod("HistoricalContributionTaxFind");
  /** Variable representing the HistoricalContributionTaxGet method */
  public static final HistoricalContributionTaxRequestMethod HISTORICAL_CONTRIBUTION_TAX_GET = new HistoricalContributionTaxRequestMethod("HistoricalContributionTaxGet");
  /** Variable representing the HistoricalContributionTaxUpdate method */
  public static final HistoricalContributionTaxRequestMethod HISTORICAL_CONTRIBUTION_TAX_UPDATE = new HistoricalContributionTaxRequestMethod("HistoricalContributionTaxUpdate");
}
