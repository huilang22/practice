/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AdjTransGroup related UdtRequests
 *
 */

public abstract class AdjTransGroupRequest extends UdtRequest {

/**
 *
 * Constructor for AdjTransGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AdjTransGroupRequest(String id, String method) {
    super(id, "AdjTransGroup", method);
  }
}
