/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all PointCategory related UdtRequests
 *
 */

public abstract class PointCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for PointCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public PointCategoryRequest(String id, String method) {
    super(id, "PointCategory", method);
  }
}
