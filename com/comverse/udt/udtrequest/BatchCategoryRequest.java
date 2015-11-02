/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchCategory related UdtRequests
 *
 */

public abstract class BatchCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for BatchCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchCategoryRequest(String id, String method) {
    super(id, "BatchCategory", method);
  }
}
