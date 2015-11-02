/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BusinessDay related UdtRequests
 *
 */

public abstract class BusinessDayRequest extends UdtRequest {

/**
 *
 * Constructor for BusinessDayRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BusinessDayRequest(String id, String method) {
    super(id, "BusinessDay", method);
  }
}
