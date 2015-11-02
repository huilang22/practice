/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceSubRequestParent.java
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
 * Abstract base class for all SecurityResource related UdtSubRequestParents
 *
 */
public abstract class SecurityResourceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityResourceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityResourceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecurityResourceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityResourceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecurityResourceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecurityResourceSubRequestParent(String id, String method) {
    super(id, "SecurityResource", method);
  }
}
