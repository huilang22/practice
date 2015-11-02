/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ValidMilestoneStatus related UdtRequests
 *
 */

public abstract class ValidMilestoneStatusRequest extends UdtRequest {

/**
 *
 * Constructor for ValidMilestoneStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ValidMilestoneStatusRequest(String id, String method) {
    super(id, "ValidMilestoneStatus", method);
  }
}
