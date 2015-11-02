/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimResellerRefSubRequestParent.java
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
 * Abstract base class for all InvsSimResellerRef related UdtSubRequestParents
 *
 */
public abstract class InvsSimResellerRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSimResellerRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimResellerRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSimResellerRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSimResellerRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSimResellerRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSimResellerRefSubRequestParent(String id, String method) {
    super(id, "InvsSimResellerRef", method);
  }
}