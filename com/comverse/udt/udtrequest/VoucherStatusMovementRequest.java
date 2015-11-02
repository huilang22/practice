/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherStatusMovement related UdtRequests
 *
 */

public abstract class VoucherStatusMovementRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherStatusMovementRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherStatusMovementRequest(String id, String method) {
    super(id, "VoucherStatusMovement", method);
  }
}
