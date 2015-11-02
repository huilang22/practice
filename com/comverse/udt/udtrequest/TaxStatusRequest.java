/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all TaxStatus related UdtRequests
 *
 */

public abstract class TaxStatusRequest extends UdtRequest {

/**
 *
 * Constructor for TaxStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public TaxStatusRequest(String id, String method) {
    super(id, "TaxStatus", method);
  }
}
