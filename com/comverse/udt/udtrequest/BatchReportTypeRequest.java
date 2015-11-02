/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchReportType related UdtRequests
 *
 */

public abstract class BatchReportTypeRequest extends UdtRequest {

/**
 *
 * Constructor for BatchReportTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchReportTypeRequest(String id, String method) {
    super(id, "BatchReportType", method);
  }
}
