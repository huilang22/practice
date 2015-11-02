/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaInventoryAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaInventoryAssoc related UdtRequests
 *
 */

public abstract class GeoAreaInventoryAssocRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaInventoryAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaInventoryAssocRequest(String id, String method) {
    super(id, "GeoAreaInventoryAssoc", method);
  }
}
