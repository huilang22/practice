/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TransferReason related UdtRequests
 *
 */

public abstract class TransferReasonRequest extends UdtRequest {

/**
 *
 * Constructor for TransferReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TransferReasonRequest(String id, String method) {
    super(id, "TransferReason", method);
  }
}
