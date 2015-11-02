/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefSubRequestParent.java
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
 * Abstract base class for all InvsLocationRef related UdtSubRequestParents
 *
 */
public abstract class InvsLocationRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLocationRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLocationRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLocationRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLocationRefSubRequestParent(String id, String method) {
    super(id, "InvsLocationRef", method);
  }
}
