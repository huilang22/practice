/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all NonWorkDays related UdtRequests
 *
 */

public abstract class NonWorkDaysRequest extends UdtRequest {

/**
 *
 * Constructor for NonWorkDaysRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public NonWorkDaysRequest(String id, String method) {
    super(id, "NonWorkDays", method);
  }
}
