/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsSimReseller related UdtRequests
 *
 */

public abstract class InvsSimResellerRequest extends UdtRequest {

/**
 *
 * Constructor for InvsSimResellerRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsSimResellerRequest(String id, String method) {
    super(id, "InvsSimReseller", method);
  }
}
