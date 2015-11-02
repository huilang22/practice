/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all MultiLinesAdj related UdtRequests
 *
 */

public abstract class MultiLinesAdjRequest extends UdtRequest {

/**
 *
 * Constructor for MultiLinesAdjRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public MultiLinesAdjRequest(String id, String method) {
    super(id, "MultiLinesAdj", method);
  }
}
