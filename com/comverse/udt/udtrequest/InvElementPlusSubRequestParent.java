/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusSubRequestParent.java
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
 * Abstract base class for all InvElementPlus related UdtSubRequestParents
 *
 */
public abstract class InvElementPlusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvElementPlusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementPlusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvElementPlusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementPlusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvElementPlusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvElementPlusSubRequestParent(String id, String method) {
    super(id, "InvElementPlus", method);
  }
}
