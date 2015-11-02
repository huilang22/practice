/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeSubRequestParent.java
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
 * Abstract base class for all InvsSecurityType related UdtSubRequestParents
 *
 */
public abstract class InvsSecurityTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsSecurityTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSecurityTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsSecurityTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsSecurityTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsSecurityTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsSecurityTypeSubRequestParent(String id, String method) {
    super(id, "InvsSecurityType", method);
  }
}
