/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStockPropertyRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsStockProperty related UdtRequests
 *
 */

public abstract class InvsStockPropertyRequest extends UdtRequest {

/**
 *
 * Constructor for InvsStockPropertyRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsStockPropertyRequest(String id, String method) {
    super(id, "InvsStockProperty", method);
  }
}
