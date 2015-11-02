/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductJurisdictionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ProductJurisdiction related UdtRequests
 *
 */

public abstract class ProductJurisdictionRequest extends UdtRequest {

/**
 *
 * Constructor for ProductJurisdictionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ProductJurisdictionRequest(String id, String method) {
    super(id, "ProductJurisdiction", method);
  }
}
