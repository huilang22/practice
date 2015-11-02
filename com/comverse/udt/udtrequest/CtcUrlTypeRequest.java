/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcUrlType related UdtRequests
 *
 */

public abstract class CtcUrlTypeRequest extends UdtRequest {

/**
 *
 * Constructor for CtcUrlTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcUrlTypeRequest(String id, String method) {
    super(id, "CtcUrlType", method);
  }
}
