/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrSymbol related UdtRequests
 *
 */

public abstract class RbrSymbolRequest extends UdtRequest {

/**
 *
 * Constructor for RbrSymbolRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrSymbolRequest(String id, String method) {
    super(id, "RbrSymbol", method);
  }
}
