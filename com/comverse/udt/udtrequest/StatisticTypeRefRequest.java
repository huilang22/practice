/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all StatisticTypeRef related UdtRequests
 *
 */

public abstract class StatisticTypeRefRequest extends UdtRequest {

/**
 *
 * Constructor for StatisticTypeRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public StatisticTypeRefRequest(String id, String method) {
    super(id, "StatisticTypeRef", method);
  }
}
