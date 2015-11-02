/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ClearingHouseInfo related UdtRequests
 *
 */

public abstract class ClearingHouseInfoRequest extends UdtRequest {

/**
 *
 * Constructor for ClearingHouseInfoRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ClearingHouseInfoRequest(String id, String method) {
    super(id, "ClearingHouseInfo", method);
  }
}
