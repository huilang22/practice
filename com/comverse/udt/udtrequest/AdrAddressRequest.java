/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdrAddress related UdtRequests
 *
 */

public abstract class AdrAddressRequest extends UdtRequest {

/**
 *
 * Constructor for AdrAddressRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdrAddressRequest(String id, String method) {
    super(id, "AdrAddress", method);
  }
}
