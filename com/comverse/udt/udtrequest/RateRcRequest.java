/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateRcRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateRc related UdtRequests
 *
 */

public abstract class RateRcRequest extends UdtRequest {

/**
 *
 * Constructor for RateRcRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateRcRequest(String id, String method) {
    super(id, "RateRc", method);
  }
}
