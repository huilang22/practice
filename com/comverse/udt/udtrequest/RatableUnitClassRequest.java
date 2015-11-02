/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatableUnitClassRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RatableUnitClass related UdtRequests
 *
 */

public abstract class RatableUnitClassRequest extends UdtRequest {

/**
 *
 * Constructor for RatableUnitClassRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RatableUnitClassRequest(String id, String method) {
    super(id, "RatableUnitClass", method);
  }
}
