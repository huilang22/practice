/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneSubRequestParent.java
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
 * Abstract base class for all MobileZone related UdtSubRequestParents
 *
 */
public abstract class MobileZoneSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MobileZoneRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MobileZoneRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MobileZoneSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MobileZoneSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MobileZoneSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MobileZoneSubRequestParent(String id, String method) {
    super(id, "MobileZone", method);
  }
}
