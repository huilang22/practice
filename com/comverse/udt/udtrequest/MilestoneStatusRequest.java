/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MilestoneStatus related UdtRequests
 *
 */

public abstract class MilestoneStatusRequest extends UdtRequest {

/**
 *
 * Constructor for MilestoneStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MilestoneStatusRequest(String id, String method) {
    super(id, "MilestoneStatus", method);
  }
}
