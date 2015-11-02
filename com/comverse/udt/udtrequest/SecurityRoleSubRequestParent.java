/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityRoleSubRequestParent.java
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
 * Abstract base class for all SecurityRole related UdtSubRequestParents
 *
 */
public abstract class SecurityRoleSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityRoleRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityRoleRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecurityRoleSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityRoleSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecurityRoleSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecurityRoleSubRequestParent(String id, String method) {
    super(id, "SecurityRole", method);
  }
}
