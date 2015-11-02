/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMncSubRequestParent.java
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
 * Abstract base class for all InvsMnc related UdtSubRequestParents
 *
 */
public abstract class InvsMncSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsMncRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsMncRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsMncSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsMncSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsMncSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsMncSubRequestParent(String id, String method) {
    super(id, "InvsMnc", method);
  }
}
