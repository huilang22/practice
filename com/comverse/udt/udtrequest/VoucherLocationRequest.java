/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherLocation related UdtRequests
 *
 */

public abstract class VoucherLocationRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherLocationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherLocationRequest(String id, String method) {
    super(id, "VoucherLocation", method);
  }
}
