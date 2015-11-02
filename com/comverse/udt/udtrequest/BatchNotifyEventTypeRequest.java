/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchNotifyEventType related UdtRequests
 *
 */

public abstract class BatchNotifyEventTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BatchNotifyEventTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchNotifyEventTypeRequest(String id, String method) {
    super(id, "BatchNotifyEventType", method);
  }
}
