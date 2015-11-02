/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BamErrorCode related UdtRequests
 *
 */

public abstract class BamErrorCodeRequest extends UdtRequest {

/**
 *
 * Constructor for BamErrorCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BamErrorCodeRequest(String id, String method) {
    super(id, "BamErrorCode", method);
  }
}
