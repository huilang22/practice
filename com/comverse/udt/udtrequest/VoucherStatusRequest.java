/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherStatus related UdtRequests
 *
 */

public abstract class VoucherStatusRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherStatusRequest(String id, String method) {
    super(id, "VoucherStatus", method);
  }
}
