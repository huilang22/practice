/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsGeographicRegionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsGeographicRegion related UdtRequests
 *
 */

public abstract class InvsGeographicRegionRequest extends UdtRequest {

/**
 *
 * Constructor for InvsGeographicRegionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsGeographicRegionRequest(String id, String method) {
    super(id, "InvsGeographicRegion", method);
  }
}
