/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillCycleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillCycle related UdtRequests
 *
 */

public abstract class BillCycleRequest extends UdtRequest {

/**
 *
 * Constructor for BillCycleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillCycleRequest(String id, String method) {
    super(id, "BillCycle", method);
  }
}
