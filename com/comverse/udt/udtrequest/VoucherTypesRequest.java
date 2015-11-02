/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherTypes related UdtRequests
 *
 */

public abstract class VoucherTypesRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherTypesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherTypesRequest(String id, String method) {
    super(id, "VoucherTypes", method);
  }
}
