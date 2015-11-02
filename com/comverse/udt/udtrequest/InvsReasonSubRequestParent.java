/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonSubRequestParent.java
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
 * Abstract base class for all InvsReason related UdtSubRequestParents
 *
 */
public abstract class InvsReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsReasonSubRequestParent(String id, String method) {
    super(id, "InvsReason", method);
  }
}
