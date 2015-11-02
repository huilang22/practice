/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaSvcGrpMember related UdtRequests
 *
 */

public abstract class GeoAreaSvcGrpMemberRequest extends UdtRequest {

/**
 *
 * Constructor for GeoAreaSvcGrpMemberRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GeoAreaSvcGrpMemberRequest(String id, String method) {
    super(id, "GeoAreaSvcGrpMember", method);
  }
}
