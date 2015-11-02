/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoArea related UdtRequests
 *
 */

public abstract class GeoAreaRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaRequest(String id, String method) {
    super(id, "GeoArea", method);
  }
}
