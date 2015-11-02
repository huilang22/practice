/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountMessageRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountMessage related UdtRequests
 *
 */

public abstract class AccountMessageRequest extends UdtRequest {

/**
 *
 * Constructor for AccountMessageRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountMessageRequest(String id, String method) {
    super(id, "AccountMessage", method);
  }
}
