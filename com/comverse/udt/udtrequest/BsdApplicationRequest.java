/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BsdApplication related UdtRequests
 *
 */

public abstract class BsdApplicationRequest extends UdtRequest {

/**
 *
 * Constructor for BsdApplicationRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BsdApplicationRequest(String id, String method) {
    super(id, "BsdApplication", method);
  }
}
