/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaSvcGrpMemberSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GeoAreaSvcGrpMember related UdtSubRequestParents
 *
 */
public abstract class GeoAreaSvcGrpMemberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GeoAreaSvcGrpMemberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaSvcGrpMemberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GeoAreaSvcGrpMemberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GeoAreaSvcGrpMemberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GeoAreaSvcGrpMemberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GeoAreaSvcGrpMemberSubRequestParent(String id, String method) {
    super(id, "GeoAreaSvcGrpMember", method);
  }
}
