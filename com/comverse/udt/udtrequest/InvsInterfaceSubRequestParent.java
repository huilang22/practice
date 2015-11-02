/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceSubRequestParent.java
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
 * Abstract base class for all InvsInterface related UdtSubRequestParents
 *
 */
public abstract class InvsInterfaceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsInterfaceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsInterfaceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsInterfaceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsInterfaceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsInterfaceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsInterfaceSubRequestParent(String id, String method) {
    super(id, "InvsInterface", method);
  }
}
