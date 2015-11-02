/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchReportLine related UdtRequests
 *
 */

public abstract class BatchReportLineRequest extends UdtRequest {

/**
 *
 * Constructor for BatchReportLineRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public BatchReportLineRequest(String id, String method) {
    super(id, "BatchReportLine", method);
  }
}
