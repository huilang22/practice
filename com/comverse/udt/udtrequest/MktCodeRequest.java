/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MktCode related UdtRequests
 *
 */

public abstract class MktCodeRequest extends UdtRequest {

/**
 *
 * Constructor for MktCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MktCodeRequest(String id, String method) {
    super(id, "MktCode", method);
  }
}
