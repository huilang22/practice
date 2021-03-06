/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsJobtypeSubRequestParent.java
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
 * Abstract base class for all InvsJobtype related UdtSubRequestParents
 *
 */
public abstract class InvsJobtypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsJobtypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobtypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsJobtypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsJobtypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsJobtypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsJobtypeSubRequestParent(String id, String method) {
    super(id, "InvsJobtype", method);
  }
}
