/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateUnitCr related UdtRequests
 *
 */

public abstract class RateUnitCrRequest extends UdtRequest {

/**
 *
 * Constructor for RateUnitCrRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateUnitCrRequest(String id, String method) {
    super(id, "RateUnitCr", method);
  }
}
