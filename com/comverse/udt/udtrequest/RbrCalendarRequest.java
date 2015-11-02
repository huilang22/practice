/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrCalendarRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrCalendar related UdtRequests
 *
 */

public abstract class RbrCalendarRequest extends UdtRequest {

/**
 *
 * Constructor for RbrCalendarRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrCalendarRequest(String id, String method) {
    super(id, "RbrCalendar", method);
  }
}
