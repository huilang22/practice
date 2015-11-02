/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcEmfConfigRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SvcEmfConfig related UdtRequests
 *
 */

public abstract class SvcEmfConfigRequest extends UdtRequest {

/**
 *
 * Constructor for SvcEmfConfigRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SvcEmfConfigRequest(String id, String method) {
    super(id, "SvcEmfConfig", method);
  }
}
