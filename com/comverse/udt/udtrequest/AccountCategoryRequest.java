/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountCategoryRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountCategory related UdtRequests
 *
 */

public abstract class AccountCategoryRequest extends UdtRequest {

/**
 *
 * Constructor for AccountCategoryRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountCategoryRequest(String id, String method) {
    super(id, "AccountCategory", method);
  }
}
