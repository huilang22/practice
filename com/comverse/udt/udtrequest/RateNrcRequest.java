/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateNrcRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RateNrc related UdtRequests
 *
 */

public abstract class RateNrcRequest extends UdtRequest {

/**
 *
 * Constructor for RateNrcRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RateNrcRequest(String id, String method) {
    super(id, "RateNrc", method);
  }
}
