/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchNotifyType related UdtRequests
 *
 */

public abstract class BatchNotifyTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BatchNotifyTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchNotifyTypeRequest(String id, String method) {
    super(id, "BatchNotifyType", method);
  }
}
