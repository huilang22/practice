/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SystemParameter related UdtRequests
 *
 */

public abstract class SystemParameterRequest extends UdtRequest {

/**
 *
 * Constructor for SystemParameterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SystemParameterRequest(String id, String method) {
    super(id, "SystemParameter", method);
  }
}
