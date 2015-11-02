/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcInventoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcInventory related UdtRequests
 *
 */

public abstract class SvcInventoryRequest extends UdtRequest {

/**
 *
 * Constructor for SvcInventoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcInventoryRequest(String id, String method) {
    super(id, "SvcInventory", method);
  }
}
