/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobsubstateSubRequestParent.java
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
 * Abstract base class for all InvsJobsubstate related UdtSubRequestParents
 *
 */
public abstract class InvsJobsubstateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsJobsubstateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobsubstateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsJobsubstateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobsubstateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsJobsubstateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsJobsubstateSubRequestParent(String id, String method) {
    super(id, "InvsJobsubstate", method);
  }
}
