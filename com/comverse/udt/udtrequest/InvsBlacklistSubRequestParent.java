/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistSubRequestParent.java
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
 * Abstract base class for all InvsBlacklist related UdtSubRequestParents
 *
 */
public abstract class InvsBlacklistSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsBlacklistRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsBlacklistRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsBlacklistSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsBlacklistSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsBlacklistSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsBlacklistSubRequestParent(String id, String method) {
    super(id, "InvsBlacklist", method);
  }
}
