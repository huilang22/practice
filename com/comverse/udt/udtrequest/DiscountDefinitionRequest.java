/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all DiscountDefinition related UdtRequests
 *
 */

public abstract class DiscountDefinitionRequest extends UdtRequest {

/**
 *
 * Constructor for DiscountDefinitionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public DiscountDefinitionRequest(String id, String method) {
    super(id, "DiscountDefinition", method);
  }
}
