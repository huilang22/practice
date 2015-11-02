/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTableRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all RbrRateTable related UdtRequests
 *
 */

public abstract class RbrRateTableRequest extends UdtRequest {

/**
 *
 * Constructor for RbrRateTableRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public RbrRateTableRequest(String id, String method) {
    super(id, "RbrRateTable", method);
  }
}
