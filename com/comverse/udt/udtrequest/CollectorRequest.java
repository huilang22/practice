/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Collector related UdtRequests
 *
 */

public abstract class CollectorRequest extends UdtRequest {

/**
 *
 * Constructor for CollectorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CollectorRequest(String id, String method) {
    super(id, "Collector", method);
  }
}
