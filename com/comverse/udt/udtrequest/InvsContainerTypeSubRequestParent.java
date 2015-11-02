/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeSubRequestParent.java
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
 * Abstract base class for all InvsContainerType related UdtSubRequestParents
 *
 */
public abstract class InvsContainerTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsContainerTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsContainerTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsContainerTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsContainerTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsContainerTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsContainerTypeSubRequestParent(String id, String method) {
    super(id, "InvsContainerType", method);
  }
}
