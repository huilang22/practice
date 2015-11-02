/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all InvsSimCardConfig related UdtRequests
 *
 */

public abstract class InvsSimCardConfigRequest extends UdtRequest {

/**
 *
 * Constructor for InvsSimCardConfigRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public InvsSimCardConfigRequest(String id, String method) {
    super(id, "InvsSimCardConfig", method);
  }
}
