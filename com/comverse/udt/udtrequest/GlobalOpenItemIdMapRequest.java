/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GlobalOpenItemIdMap related UdtRequests
 *
 */

public abstract class GlobalOpenItemIdMapRequest extends UdtRequest {

/**
 *
 * Constructor for GlobalOpenItemIdMapRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GlobalOpenItemIdMapRequest(String id, String method) {
    super(id, "GlobalOpenItemIdMap", method);
  }
}
