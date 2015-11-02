/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRateLimitKeyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UnitCrRateLimitKey related UdtRequests
 *
 */

public abstract class UnitCrRateLimitKeyRequest extends UdtRequest {

/**
 *
 * Constructor for UnitCrRateLimitKeyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UnitCrRateLimitKeyRequest(String id, String method) {
    super(id, "UnitCrRateLimitKey", method);
  }
}
