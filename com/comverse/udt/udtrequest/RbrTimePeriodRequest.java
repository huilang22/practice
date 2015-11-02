/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrTimePeriod related UdtRequests
 *
 */

public abstract class RbrTimePeriodRequest extends UdtRequest {

/**
 *
 * Constructor for RbrTimePeriodRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrTimePeriodRequest(String id, String method) {
    super(id, "RbrTimePeriod", method);
  }
}
