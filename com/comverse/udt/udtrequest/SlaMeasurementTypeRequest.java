/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all SlaMeasurementType related UdtRequests
 *
 */

public abstract class SlaMeasurementTypeRequest extends UdtRequest {

/**
 *
 * Constructor for SlaMeasurementTypeRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public SlaMeasurementTypeRequest(String id, String method) {
    super(id, "SlaMeasurementType", method);
  }
}
