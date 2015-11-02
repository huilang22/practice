/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillingStatisticsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AbiBillingStatistics related UdtRequests
 *
 */

public abstract class AbiBillingStatisticsRequest extends UdtRequest {

/**
 *
 * Constructor for AbiBillingStatisticsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AbiBillingStatisticsRequest(String id, String method) {
    super(id, "AbiBillingStatistics", method);
  }
}
