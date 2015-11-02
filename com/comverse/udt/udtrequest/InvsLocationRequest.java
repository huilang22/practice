/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsLocation related UdtRequests
 *
 */

public abstract class InvsLocationRequest extends UdtRequest {

/**
 *
 * Constructor for InvsLocationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsLocationRequest(String id, String method) {
    super(id, "InvsLocation", method);
  }
}
