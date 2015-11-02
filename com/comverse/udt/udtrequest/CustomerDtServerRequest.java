/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDtServerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CustomerDtServer related UdtRequests
 *
 */

public abstract class CustomerDtServerRequest extends UdtRequest {

/**
 *
 * Constructor for CustomerDtServerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CustomerDtServerRequest(String id, String method) {
    super(id, "CustomerDtServer", method);
  }
}
