/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesSubRequestParent.java
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
 * Abstract base class for all AbiBillMessages related UdtSubRequestParents
 *
 */
public abstract class AbiBillMessagesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AbiBillMessagesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiBillMessagesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AbiBillMessagesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AbiBillMessagesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AbiBillMessagesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AbiBillMessagesSubRequestParent(String id, String method) {
    super(id, "AbiBillMessages", method);
  }
}
