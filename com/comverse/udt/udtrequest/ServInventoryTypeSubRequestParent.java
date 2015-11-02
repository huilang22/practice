/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInventoryTypeSubRequestParent.java
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
 * Abstract base class for all ServInventoryType related UdtSubRequestParents
 *
 */
public abstract class ServInventoryTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServInventoryTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServInventoryTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServInventoryTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServInventoryTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServInventoryTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServInventoryTypeSubRequestParent(String id, String method) {
    super(id, "ServInventoryType", method);
  }
}
