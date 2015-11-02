/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractDiscountRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ContractDiscount related UdtRequests
 *
 */

public abstract class ContractDiscountRequest extends UdtRequest {

/**
 *
 * Constructor for ContractDiscountRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ContractDiscountRequest(String id, String method) {
    super(id, "ContractDiscount", method);
  }
}
