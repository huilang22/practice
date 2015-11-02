/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillMessageGroup related UdtRequests
 *
 */

public abstract class BillMessageGroupRequest extends UdtRequest {

/**
 *
 * Constructor for BillMessageGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillMessageGroupRequest(String id, String method) {
    super(id, "BillMessageGroup", method);
  }
}
