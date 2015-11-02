/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServServiceTypeSubRequestParent.java
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
 * Abstract base class for all ServServiceType related UdtSubRequestParents
 *
 */
public abstract class ServServiceTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServServiceTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServServiceTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServServiceTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServServiceTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServServiceTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServServiceTypeSubRequestParent(String id, String method) {
    super(id, "ServServiceType", method);
  }
}
