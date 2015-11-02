/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all LineOfBusinessValues related UdtRequests
 *
 */

public abstract class LineOfBusinessValuesRequest extends UdtRequest {

/**
 *
 * Constructor for LineOfBusinessValuesRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public LineOfBusinessValuesRequest(String id, String method) {
    super(id, "LineOfBusinessValues", method);
  }
}
