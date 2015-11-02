/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ClearingHouse related UdtRequests
 *
 */

public abstract class ClearingHouseRequest extends UdtRequest {

/**
 *
 * Constructor for ClearingHouseRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ClearingHouseRequest(String id, String method) {
    super(id, "ClearingHouse", method);
  }
}
