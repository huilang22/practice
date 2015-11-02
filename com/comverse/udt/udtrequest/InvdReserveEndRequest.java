/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvdReserveEnd related UdtRequests
 *
 */

public abstract class InvdReserveEndRequest extends UdtRequest {

/**
 *
 * Constructor for InvdReserveEndRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvdReserveEndRequest(String id, String method) {
    super(id, "InvdReserveEnd", method);
  }
}
