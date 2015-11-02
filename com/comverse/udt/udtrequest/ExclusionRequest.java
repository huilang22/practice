/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all Exclusion related UdtRequests
 *
 */

public abstract class ExclusionRequest extends UdtRequest {

/**
 *
 * Constructor for ExclusionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ExclusionRequest(String id, String method) {
    super(id, "Exclusion", method);
  }
}
