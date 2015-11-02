/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInsertGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillInsertGroup related UdtRequests
 *
 */

public abstract class BillInsertGroupRequest extends UdtRequest {

/**
 *
 * Constructor for BillInsertGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillInsertGroupRequest(String id, String method) {
    super(id, "BillInsertGroup", method);
  }
}
