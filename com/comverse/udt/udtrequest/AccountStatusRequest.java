/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AccountStatus related UdtRequests
 *
 */

public abstract class AccountStatusRequest extends UdtRequest {

/**
 *
 * Constructor for AccountStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AccountStatusRequest(String id, String method) {
    super(id, "AccountStatus", method);
  }
}
