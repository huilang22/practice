/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGeoAreaScheduleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcGeoAreaSchedule related UdtRequests
 *
 */

public abstract class CtcGeoAreaScheduleRequest extends UdtRequest {

/**
 *
 * Constructor for CtcGeoAreaScheduleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcGeoAreaScheduleRequest(String id, String method) {
    super(id, "CtcGeoAreaSchedule", method);
  }
}
