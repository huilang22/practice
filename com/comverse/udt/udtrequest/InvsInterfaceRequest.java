/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsInterface related UdtRequests
 *
 */

public abstract class InvsInterfaceRequest extends UdtRequest {

/**
 *
 * Constructor for InvsInterfaceRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsInterfaceRequest(String id, String method) {
    super(id, "InvsInterface", method);
  }
}
