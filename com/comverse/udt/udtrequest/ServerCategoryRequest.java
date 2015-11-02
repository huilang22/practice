/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ServerCategory related UdtRequests
 *
 */

public abstract class ServerCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for ServerCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ServerCategoryRequest(String id, String method) {
    super(id, "ServerCategory", method);
  }
}
