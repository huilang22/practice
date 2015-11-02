/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressSecondaryUnitTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AddressSecondaryUnitType related UdtRequests
 *
 */

public abstract class AddressSecondaryUnitTypeRequest extends UdtRequest {

/**
 *
 * Constructor for AddressSecondaryUnitTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AddressSecondaryUnitTypeRequest(String id, String method) {
    super(id, "AddressSecondaryUnitType", method);
  }
}
