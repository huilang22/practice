/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusChgReasonRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CmfStatusChgReason related UdtRequests
 *
 */

public abstract class CmfStatusChgReasonRequest extends UdtRequest {

/**
 *
 * Constructor for CmfStatusChgReasonRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CmfStatusChgReasonRequest(String id, String method) {
    super(id, "CmfStatusChgReason", method);
  }
}
