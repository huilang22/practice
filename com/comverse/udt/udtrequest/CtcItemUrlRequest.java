/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CtcItemUrl related UdtRequests
 *
 */

public abstract class CtcItemUrlRequest extends UdtRequest {

/**
 *
 * Constructor for CtcItemUrlRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CtcItemUrlRequest(String id, String method) {
    super(id, "CtcItemUrl", method);
  }
}
