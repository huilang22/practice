/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdjustmentTypeGroups related UdtRequests
 *
 */

public abstract class AdjustmentTypeGroupsRequest extends UdtRequest {

/**
 *
 * Constructor for AdjustmentTypeGroupsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdjustmentTypeGroupsRequest(String id, String method) {
    super(id, "AdjustmentTypeGroups", method);
  }
}
