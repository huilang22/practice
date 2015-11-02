/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeSubRequestParent.java
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
 * Abstract base class for all CitTaskType related UdtSubRequestParents
 *
 */
public abstract class CitTaskTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitTaskTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitTaskTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitTaskTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitTaskTypeSubRequestParent(String id, String method) {
    super(id, "CitTaskType", method);
  }
}
