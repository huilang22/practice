/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorSubRequestParent.java
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
 * Abstract base class for all InvSimVector related UdtSubRequestParents
 *
 */
public abstract class InvSimVectorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvSimVectorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimVectorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvSimVectorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvSimVectorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvSimVectorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvSimVectorSubRequestParent(String id, String method) {
    super(id, "InvSimVector", method);
  }
}
