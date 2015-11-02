/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaAddressAssoc related UdtRequests
 *
 */

public abstract class GeoAreaAddressAssocRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaAddressAssocRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaAddressAssocRequest(String id, String method) {
    super(id, "GeoAreaAddressAssoc", method);
  }
}
