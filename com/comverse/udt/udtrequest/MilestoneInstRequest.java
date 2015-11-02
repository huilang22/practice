/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MilestoneInst related UdtRequests
 *
 */

public abstract class MilestoneInstRequest extends UdtRequest {

/**
 *
 * Constructor for MilestoneInstRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MilestoneInstRequest(String id, String method) {
    super(id, "MilestoneInst", method);
  }
}
