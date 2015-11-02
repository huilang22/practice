/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SlaMeasurementData related UdtRequests
 *
 */

public abstract class SlaMeasurementDataRequest extends UdtRequest {

/**
 *
 * Constructor for SlaMeasurementDataRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SlaMeasurementDataRequest(String id, String method) {
    super(id, "SlaMeasurementData", method);
  }
}
