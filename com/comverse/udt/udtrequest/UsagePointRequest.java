/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsagePoint related UdtRequests
 *
 */

public abstract class UsagePointRequest extends UdtRequest {

/**
 *
 * Constructor for UsagePointRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsagePointRequest(String id, String method) {
    super(id, "UsagePoint", method);
  }
}
