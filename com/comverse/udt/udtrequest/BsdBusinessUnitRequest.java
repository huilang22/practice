/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdBusinessUnit related UdtRequests
 *
 */

public abstract class BsdBusinessUnitRequest extends UdtRequest {

/**
 *
 * Constructor for BsdBusinessUnitRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdBusinessUnitRequest(String id, String method) {
    super(id, "BsdBusinessUnit", method);
  }
}
