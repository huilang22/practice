/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcScheduleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcSchedule related UdtRequests
 *
 */

public abstract class CtcScheduleRequest extends UdtRequest {

/**
 *
 * Constructor for CtcScheduleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcScheduleRequest(String id, String method) {
    super(id, "CtcSchedule", method);
  }
}
