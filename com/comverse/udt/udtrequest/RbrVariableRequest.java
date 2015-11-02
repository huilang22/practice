/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrVariable related UdtRequests
 *
 */

public abstract class RbrVariableRequest extends UdtRequest {

/**
 *
 * Constructor for RbrVariableRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrVariableRequest(String id, String method) {
    super(id, "RbrVariable", method);
  }
}
