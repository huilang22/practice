/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all AppName related UdtRequests
 *
 */

public abstract class AppNameRequest extends UdtRequest {

/**
 *
 * Constructor for AppNameRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public AppNameRequest(String id, String method) {
    super(id, "AppName", method);
  }
}
