/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobstatusSubRequestParent.java
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
 * Abstract base class for all InvsJobstatus related UdtSubRequestParents
 *
 */
public abstract class InvsJobstatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsJobstatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobstatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsJobstatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobstatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsJobstatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsJobstatusSubRequestParent(String id, String method) {
    super(id, "InvsJobstatus", method);
  }
}
