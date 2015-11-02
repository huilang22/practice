/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BalanceXferDiff related UdtRequests
 *
 */

public abstract class BalanceXferDiffRequest extends UdtRequest {

/**
 *
 * Constructor for BalanceXferDiffRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BalanceXferDiffRequest(String id, String method) {
    super(id, "BalanceXferDiff", method);
  }
}
