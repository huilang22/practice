/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecuritySubRequestParent.java
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
 * Abstract base class for all InvSecurity related UdtSubRequestParents
 *
 */
public abstract class InvSecuritySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvSecurityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSecurityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvSecuritySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSecuritySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvSecuritySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvSecuritySubRequestParent(String id, String method) {
    super(id, "InvSecurity", method);
  }
}
