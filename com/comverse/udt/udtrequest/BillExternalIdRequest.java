/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillExternalIdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BillExternalId related UdtRequests
 *
 */

public abstract class BillExternalIdRequest extends UdtRequest {

/**
 *
 * Constructor for BillExternalIdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BillExternalIdRequest(String id, String method) {
    super(id, "BillExternalId", method);
  }
}
