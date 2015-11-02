/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillModeOverride related UdtRequests
 *
 */

public abstract class BillModeOverrideRequest extends UdtRequest {

/**
 *
 * Constructor for BillModeOverrideRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillModeOverrideRequest(String id, String method) {
    super(id, "BillModeOverride", method);
  }
}
