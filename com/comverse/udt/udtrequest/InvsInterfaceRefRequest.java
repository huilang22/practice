/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsInterfaceRef related UdtRequests
 *
 */

public abstract class InvsInterfaceRefRequest extends UdtRequest {

/**
 *
 * Constructor for InvsInterfaceRefRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsInterfaceRefRequest(String id, String method) {
    super(id, "InvsInterfaceRef", method);
  }
}
