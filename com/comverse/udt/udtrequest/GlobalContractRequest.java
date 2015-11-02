/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GlobalContract related UdtRequests
 *
 */

public abstract class GlobalContractRequest extends UdtRequest {

/**
 *
 * Constructor for GlobalContractRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GlobalContractRequest(String id, String method) {
    super(id, "GlobalContract", method);
  }
}
