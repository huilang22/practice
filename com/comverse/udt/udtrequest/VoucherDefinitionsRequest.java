/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VoucherDefinitions related UdtRequests
 *
 */

public abstract class VoucherDefinitionsRequest extends UdtRequest {

/**
 *
 * Constructor for VoucherDefinitionsRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VoucherDefinitionsRequest(String id, String method) {
    super(id, "VoucherDefinitions", method);
  }
}
