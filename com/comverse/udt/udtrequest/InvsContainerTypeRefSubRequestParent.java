/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefSubRequestParent.java
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
 * Abstract base class for all InvsContainerTypeRef related UdtSubRequestParents
 *
 */
public abstract class InvsContainerTypeRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsContainerTypeRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsContainerTypeRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsContainerTypeRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsContainerTypeRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsContainerTypeRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsContainerTypeRefSubRequestParent(String id, String method) {
    super(id, "InvsContainerTypeRef", method);
  }
}
