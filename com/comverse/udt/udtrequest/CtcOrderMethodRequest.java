/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcOrderMethod related UdtRequests
 *
 */

public abstract class CtcOrderMethodRequest extends UdtRequest {

/**
 *
 * Constructor for CtcOrderMethodRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcOrderMethodRequest(String id, String method) {
    super(id, "CtcOrderMethod", method);
  }
}
