/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressStreetDirectionalRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AddressStreetDirectional related UdtRequests
 *
 */

public abstract class AddressStreetDirectionalRequest extends UdtRequest {

/**
 *
 * Constructor for AddressStreetDirectionalRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AddressStreetDirectionalRequest(String id, String method) {
    super(id, "AddressStreetDirectional", method);
  }
}
