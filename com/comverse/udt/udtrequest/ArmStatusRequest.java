/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ArmStatus related UdtRequests
 *
 */

public abstract class ArmStatusRequest extends UdtRequest {

/**
 *
 * Constructor for ArmStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public ArmStatusRequest(String id, String method) {
    super(id, "ArmStatus", method);
  }
}
