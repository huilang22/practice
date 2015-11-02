/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CurrencyGroupRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CurrencyGroup related UdtRequests
 *
 */

public abstract class CurrencyGroupRequest extends UdtRequest {

/**
 *
 * Constructor for CurrencyGroupRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CurrencyGroupRequest(String id, String method) {
    super(id, "CurrencyGroup", method);
  }
}
