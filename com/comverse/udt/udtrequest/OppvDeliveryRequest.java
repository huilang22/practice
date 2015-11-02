/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OppvDeliveryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all OppvDelivery related UdtRequests
 *
 */

public abstract class OppvDeliveryRequest extends UdtRequest {

/**
 *
 * Constructor for OppvDeliveryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public OppvDeliveryRequest(String id, String method) {
    super(id, "OppvDelivery", method);
  }
}
