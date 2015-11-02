/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityPortalSubRequestParent.java
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
 * Abstract base class for all SecurityPortal related UdtSubRequestParents
 *
 */
public abstract class SecurityPortalSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityPortalRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityPortalRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecurityPortalSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityPortalSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecurityPortalSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecurityPortalSubRequestParent(String id, String method) {
    super(id, "SecurityPortal", method);
  }
}
