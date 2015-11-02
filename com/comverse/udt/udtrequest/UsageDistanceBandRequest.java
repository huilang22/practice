/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageDistanceBand related UdtRequests
 *
 */

public abstract class UsageDistanceBandRequest extends UdtRequest {

/**
 *
 * Constructor for UsageDistanceBandRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageDistanceBandRequest(String id, String method) {
    super(id, "UsageDistanceBand", method);
  }
}
