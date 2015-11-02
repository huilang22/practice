/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageTypeUnit related UdtRequests
 *
 */

public abstract class UsageTypeUnitRequest extends UdtRequest {

/**
 *
 * Constructor for UsageTypeUnitRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageTypeUnitRequest(String id, String method) {
    super(id, "UsageTypeUnit", method);
  }
}
