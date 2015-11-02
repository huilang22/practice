/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CsrGroupFunction related UdtRequests
 *
 */

public abstract class CsrGroupFunctionRequest extends UdtRequest {

/**
 *
 * Constructor for CsrGroupFunctionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CsrGroupFunctionRequest(String id, String method) {
    super(id, "CsrGroupFunction", method);
  }
}
