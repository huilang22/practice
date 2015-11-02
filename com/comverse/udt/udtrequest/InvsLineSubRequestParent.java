/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineSubRequestParent.java
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
 * Abstract base class for all InvsLine related UdtSubRequestParents
 *
 */
public abstract class InvsLineSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLineRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLineRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLineSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLineSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLineSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLineSubRequestParent(String id, String method) {
    super(id, "InvsLine", method);
  }
}
