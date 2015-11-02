/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StatisticTypeValues related UdtRequests
 *
 */

public abstract class StatisticTypeValuesRequest extends UdtRequest {

/**
 *
 * Constructor for StatisticTypeValuesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatisticTypeValuesRequest(String id, String method) {
    super(id, "StatisticTypeValues", method);
  }
}
