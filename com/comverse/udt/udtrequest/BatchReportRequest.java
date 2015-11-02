/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchReport related UdtRequests
 *
 */

public abstract class BatchReportRequest extends UdtRequest {

/**
 *
 * Constructor for BatchReportRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchReportRequest(String id, String method) {
    super(id, "BatchReport", method);
  }
}
