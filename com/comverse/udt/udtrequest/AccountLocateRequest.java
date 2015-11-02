/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountLocateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountLocate related UdtRequests
 *
 */

public abstract class AccountLocateRequest extends UdtRequest {

/**
 *
 * Constructor for AccountLocateRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountLocateRequest(String id, String method) {
    super(id, "AccountLocate", method);
  }
}
