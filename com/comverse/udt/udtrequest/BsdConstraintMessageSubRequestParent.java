/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageSubRequestParent.java
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
 * Abstract base class for all BsdConstraintMessage related UdtSubRequestParents
 *
 */
public abstract class BsdConstraintMessageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdConstraintMessageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdConstraintMessageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdConstraintMessageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdConstraintMessageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdConstraintMessageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdConstraintMessageSubRequestParent(String id, String method) {
    super(id, "BsdConstraintMessage", method);
  }
}
