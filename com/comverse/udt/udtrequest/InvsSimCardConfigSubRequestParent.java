/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigSubRequestParent.java
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
 * Abstract base class for all InvsSimCardConfig related UdtSubRequestParents
 *
 */
public abstract class InvsSimCardConfigSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimCardConfigRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimCardConfigRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimCardConfigSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimCardConfigSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimCardConfigSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimCardConfigSubRequestParent(String id, String method) {
    super(id, "InvsSimCardConfig", method);
  }
}
