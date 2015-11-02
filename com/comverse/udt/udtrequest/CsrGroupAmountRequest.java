/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupAmountRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CsrGroupAmount related UdtRequests
 *
 */

public abstract class CsrGroupAmountRequest extends UdtRequest {

/**
 *
 * Constructor for CsrGroupAmountRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CsrGroupAmountRequest(String id, String method) {
    super(id, "CsrGroupAmount", method);
  }
}
