/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageCreditRate related UdtRequests
 *
 */

public abstract class UsageCreditRateRequest extends UdtRequest {

/**
 *
 * Constructor for UsageCreditRateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageCreditRateRequest(String id, String method) {
    super(id, "UsageCreditRate", method);
  }
}
