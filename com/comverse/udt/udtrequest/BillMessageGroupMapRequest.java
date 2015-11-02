/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillMessageGroupMap related UdtRequests
 *
 */

public abstract class BillMessageGroupMapRequest extends UdtRequest {

/**
 *
 * Constructor for BillMessageGroupMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillMessageGroupMapRequest(String id, String method) {
    super(id, "BillMessageGroupMap", method);
  }
}
