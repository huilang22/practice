/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInvElementSubRequestParent.java
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
 * Abstract base class for all ServInvElement related UdtSubRequestParents
 *
 */
public abstract class ServInvElementSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServInvElementRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServInvElementRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServInvElementSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServInvElementSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServInvElementSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServInvElementSubRequestParent(String id, String method) {
    super(id, "ServInvElement", method);
  }
}
