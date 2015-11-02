/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all UsageUnitsConvert related UdtRequests
 *
 */

public abstract class UsageUnitsConvertRequest extends UdtRequest {

/**
 *
 * Constructor for UsageUnitsConvertRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public UsageUnitsConvertRequest(String id, String method) {
    super(id, "UsageUnitsConvert", method);
  }
}
