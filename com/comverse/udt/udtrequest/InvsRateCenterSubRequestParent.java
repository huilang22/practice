/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterSubRequestParent.java
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
 * Abstract base class for all InvsRateCenter related UdtSubRequestParents
 *
 */
public abstract class InvsRateCenterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsRateCenterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsRateCenterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsRateCenterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsRateCenterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsRateCenterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsRateCenterSubRequestParent(String id, String method) {
    super(id, "InvsRateCenter", method);
  }
}
