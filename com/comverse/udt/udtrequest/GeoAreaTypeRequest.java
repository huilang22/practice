/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaType related UdtRequests
 *
 */

public abstract class GeoAreaTypeRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaTypeRequest(String id, String method) {
    super(id, "GeoAreaType", method);
  }
}
