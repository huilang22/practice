/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ConnectReason related UdtRequests
 *
 */

public abstract class ConnectReasonRequest extends UdtRequest {

/**
 *
 * Constructor for ConnectReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ConnectReasonRequest(String id, String method) {
    super(id, "ConnectReason", method);
  }
}
