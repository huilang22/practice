/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LateFeeRateOverrides related UdtRequests
 *
 */

public abstract class LateFeeRateOverridesRequest extends UdtRequest {

/**
 *
 * Constructor for LateFeeRateOverridesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LateFeeRateOverridesRequest(String id, String method) {
    super(id, "LateFeeRateOverrides", method);
  }
}
