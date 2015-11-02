/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CmfStatus related UdtRequests
 *
 */

public abstract class CmfStatusRequest extends UdtRequest {

/**
 *
 * Constructor for CmfStatusRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CmfStatusRequest(String id, String method) {
    super(id, "CmfStatus", method);
  }
}
