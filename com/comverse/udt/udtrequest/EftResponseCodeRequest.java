/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EftResponseCode related UdtRequests
 *
 */

public abstract class EftResponseCodeRequest extends UdtRequest {

/**
 *
 * Constructor for EftResponseCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EftResponseCodeRequest(String id, String method) {
    super(id, "EftResponseCode", method);
  }
}
