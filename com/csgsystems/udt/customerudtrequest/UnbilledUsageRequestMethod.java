/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class UnbilledUsageRequestMethod implements UdtMethod {
  private String method = null;
  private UnbilledUsageRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the UnbilledUsageAdjust method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_ADJUST = new UnbilledUsageRequestMethod("UnbilledUsageAdjust");
  /** Variable representing the UnbilledUsageAmountGet method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_AMOUNT_GET = new UnbilledUsageRequestMethod("UnbilledUsageAmountGet");
  /** Variable representing the UnbilledUsageByAccountFind method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_BY_ACCOUNT_FIND = new UnbilledUsageRequestMethod("UnbilledUsageByAccountFind");
  /** Variable representing the UnbilledUsageByAccountFindCount method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_BY_ACCOUNT_FIND_COUNT = new UnbilledUsageRequestMethod("UnbilledUsageByAccountFindCount");
  /** Variable representing the UnbilledUsageByServiceFind method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_BY_SERVICE_FIND = new UnbilledUsageRequestMethod("UnbilledUsageByServiceFind");
  /** Variable representing the UnbilledUsageByServiceFindCount method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_BY_SERVICE_FIND_COUNT = new UnbilledUsageRequestMethod("UnbilledUsageByServiceFindCount");
  /** Variable representing the UnbilledUsageFind method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND = new UnbilledUsageRequestMethod("UnbilledUsageFind");
  /** Variable representing the UnbilledUsageFindCount method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND_COUNT = new UnbilledUsageRequestMethod("UnbilledUsageFindCount");
  /** Variable representing the UnbilledUsageFindFast method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND_FAST = new UnbilledUsageRequestMethod("UnbilledUsageFindFast");
  /** Variable representing the UnbilledUsageFindFastCount method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND_FAST_COUNT = new UnbilledUsageRequestMethod("UnbilledUsageFindFastCount");
  /** Variable representing the UnbilledUsageFindSummary method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND_SUMMARY = new UnbilledUsageRequestMethod("UnbilledUsageFindSummary");
  /** Variable representing the UnbilledUsageFindSummaryCount method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_FIND_SUMMARY_COUNT = new UnbilledUsageRequestMethod("UnbilledUsageFindSummaryCount");
  /** Variable representing the UnbilledUsageGet method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_GET = new UnbilledUsageRequestMethod("UnbilledUsageGet");
  /** Variable representing the UnbilledUsageTotal method */
  public static final UnbilledUsageRequestMethod UNBILLED_USAGE_TOTAL = new UnbilledUsageRequestMethod("UnbilledUsageTotal");
}
