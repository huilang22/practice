/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AddressType related UdtRequests
 *
 */

public abstract class AddressTypeRequest extends UdtRequest {

/**
 *
 * Constructor for AddressTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AddressTypeRequest(String id, String method) {
    super(id, "AddressType", method);
  }
}
