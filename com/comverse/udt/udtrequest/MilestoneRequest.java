/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Milestone related UdtRequests
 *
 */

public abstract class MilestoneRequest extends UdtRequest {

/**
 *
 * Constructor for MilestoneRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MilestoneRequest(String id, String method) {
    super(id, "Milestone", method);
  }
}
