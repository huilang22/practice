/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ChargeDistribPercent related UdtRequests
 *
 */

public abstract class ChargeDistribPercentRequest extends UdtRequest {

/**
 *
 * Constructor for ChargeDistribPercentRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ChargeDistribPercentRequest(String id, String method) {
    super(id, "ChargeDistribPercent", method);
  }
}
