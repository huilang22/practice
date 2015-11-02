/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductElementValidate related UdtRequests
 *
 */

public abstract class ProductElementValidateRequest extends UdtRequest {

/**
 *
 * Constructor for ProductElementValidateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductElementValidateRequest(String id, String method) {
    super(id, "ProductElementValidate", method);
  }
}
