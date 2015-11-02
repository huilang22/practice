/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcAddrInvServiceabilitySubRequestParent.java
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
 * Abstract base class for all SvcAddrInvServiceability related UdtSubRequestParents
 *
 */
public abstract class SvcAddrInvServiceabilitySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SvcAddrInvServiceabilityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcAddrInvServiceabilityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SvcAddrInvServiceabilitySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcAddrInvServiceabilitySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SvcAddrInvServiceabilitySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SvcAddrInvServiceabilitySubRequestParent(String id, String method) {
    super(id, "SvcAddrInvServiceability", method);
  }
}
