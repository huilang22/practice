/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all VipCode related UdtRequests
 *
 */

public abstract class VipCodeRequest extends UdtRequest {

/**
 *
 * Constructor for VipCodeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public VipCodeRequest(String id, String method) {
    super(id, "VipCode", method);
  }
}
