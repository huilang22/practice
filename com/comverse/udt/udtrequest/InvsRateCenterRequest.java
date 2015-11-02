/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsRateCenter related UdtRequests
 *
 */

public abstract class InvsRateCenterRequest extends UdtRequest {

/**
 *
 * Constructor for InvsRateCenterRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsRateCenterRequest(String id, String method) {
    super(id, "InvsRateCenter", method);
  }
}
