/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * FranchiseCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all FranchiseCode related UdtRequests
 *
 */

public abstract class FranchiseCodeRequest extends UdtRequest {

/**
 *
 * Constructor for FranchiseCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public FranchiseCodeRequest(String id, String method) {
    super(id, "FranchiseCode", method);
  }
}
