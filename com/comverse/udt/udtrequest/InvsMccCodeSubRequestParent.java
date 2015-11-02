/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsMccCodeSubRequestParent.java
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
 * Abstract base class for all InvsMccCode related UdtSubRequestParents
 *
 */
public abstract class InvsMccCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsMccCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsMccCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsMccCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsMccCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsMccCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsMccCodeSubRequestParent(String id, String method) {
    super(id, "InvsMccCode", method);
  }
}
