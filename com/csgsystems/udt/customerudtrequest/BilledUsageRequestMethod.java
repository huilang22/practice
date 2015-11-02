/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class BilledUsageRequestMethod implements UdtMethod {
  private String method = null;
  private BilledUsageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the BilledUsageAdjust method */
  public static final BilledUsageRequestMethod BILLED_USAGE_ADJUST = new BilledUsageRequestMethod("BilledUsageAdjust");
  /** Variable representing the BilledUsageAmountGet method */
  public static final BilledUsageRequestMethod BILLED_USAGE_AMOUNT_GET = new BilledUsageRequestMethod("BilledUsageAmountGet");
  /** Variable representing the BilledUsageByAccountFind method */
  public static final BilledUsageRequestMethod BILLED_USAGE_BY_ACCOUNT_FIND = new BilledUsageRequestMethod("BilledUsageByAccountFind");
  /** Variable representing the BilledUsageByAccountFindCount method */
  public static final BilledUsageRequestMethod BILLED_USAGE_BY_ACCOUNT_FIND_COUNT = new BilledUsageRequestMethod("BilledUsageByAccountFindCount");
  /** Variable representing the BilledUsageByAccountServiceFind method */
  public static final BilledUsageRequestMethod BILLED_USAGE_BY_ACCOUNT_SERVICE_FIND = new BilledUsageRequestMethod("BilledUsageByAccountServiceFind");
  /** Variable representing the BilledUsageByServiceFind method */
  public static final BilledUsageRequestMethod BILLED_USAGE_BY_SERVICE_FIND = new BilledUsageRequestMethod("BilledUsageByServiceFind");
  /** Variable representing the BilledUsageByServiceFindCount method */
  public static final BilledUsageRequestMethod BILLED_USAGE_BY_SERVICE_FIND_COUNT = new BilledUsageRequestMethod("BilledUsageByServiceFindCount");
  /** Variable representing the BilledUsageCalc method */
  public static final BilledUsageRequestMethod BILLED_USAGE_CALC = new BilledUsageRequestMethod("BilledUsageCalc");
  /** Variable representing the BilledUsageFind method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND = new BilledUsageRequestMethod("BilledUsageFind");
  /** Variable representing the BilledUsageFindCount method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND_COUNT = new BilledUsageRequestMethod("BilledUsageFindCount");
  /** Variable representing the BilledUsageFindFast method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND_FAST = new BilledUsageRequestMethod("BilledUsageFindFast");
  /** Variable representing the BilledUsageFindFastCount method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND_FAST_COUNT = new BilledUsageRequestMethod("BilledUsageFindFastCount");
  /** Variable representing the BilledUsageFindSummary method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND_SUMMARY = new BilledUsageRequestMethod("BilledUsageFindSummary");
  /** Variable representing the BilledUsageFindSummaryCount method */
  public static final BilledUsageRequestMethod BILLED_USAGE_FIND_SUMMARY_COUNT = new BilledUsageRequestMethod("BilledUsageFindSummaryCount");
  /** Variable representing the BilledUsageGet method */
  public static final BilledUsageRequestMethod BILLED_USAGE_GET = new BilledUsageRequestMethod("BilledUsageGet");
}
