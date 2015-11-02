/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AddressCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AddressCategory related UdtRequests
 *
 */

public abstract class AddressCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for AddressCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AddressCategoryRequest(String id, String method) {
    super(id, "AddressCategory", method);
  }
}
