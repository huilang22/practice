/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all EmfConfigId related UdtRequests
 *
 */

public abstract class EmfConfigIdRequest extends UdtRequest {

/**
 *
 * Constructor for EmfConfigIdRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public EmfConfigIdRequest(String id, String method) {
    super(id, "EmfConfigId", method);
  }
}
