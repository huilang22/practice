/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsProfileSubRequestParent.java
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
 * Abstract base class for all InvsProfile related UdtSubRequestParents
 *
 */
public abstract class InvsProfileSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsProfileRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsProfileRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsProfileSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsProfileSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsProfileSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsProfileSubRequestParent(String id, String method) {
    super(id, "InvsProfile", method);
  }
}
