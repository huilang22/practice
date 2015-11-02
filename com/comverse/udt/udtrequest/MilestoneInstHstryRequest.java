/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MilestoneInstHstry related UdtRequests
 *
 */

public abstract class MilestoneInstHstryRequest extends UdtRequest {

/**
 *
 * Constructor for MilestoneInstHstryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MilestoneInstHstryRequest(String id, String method) {
    super(id, "MilestoneInstHstry", method);
  }
}
