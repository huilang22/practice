/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityUserSubRequestParent.java
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
 * Abstract base class for all SecurityUser related UdtSubRequestParents
 *
 */
public abstract class SecurityUserSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityUserRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityUserRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecurityUserSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityUserSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecurityUserSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecurityUserSubRequestParent(String id, String method) {
    super(id, "SecurityUser", method);
  }
}
