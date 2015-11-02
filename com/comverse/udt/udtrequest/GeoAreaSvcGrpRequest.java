/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaSvcGrp related UdtRequests
 *
 */

public abstract class GeoAreaSvcGrpRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaSvcGrpRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaSvcGrpRequest(String id, String method) {
    super(id, "GeoAreaSvcGrp", method);
  }
}
