/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdLocaleRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdLocale related UdtRequests
 *
 */

public abstract class BsdLocaleRequest extends UdtRequest {

/**
 *
 * Constructor for BsdLocaleRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdLocaleRequest(String id, String method) {
    super(id, "BsdLocale", method);
  }
}
