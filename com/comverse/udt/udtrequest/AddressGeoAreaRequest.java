/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressGeoAreaRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AddressGeoArea related UdtRequests
 *
 */

public abstract class AddressGeoAreaRequest extends UdtRequest {

/**
 *
 * Constructor for AddressGeoAreaRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AddressGeoAreaRequest(String id, String method) {
    super(id, "AddressGeoArea", method);
  }
}
