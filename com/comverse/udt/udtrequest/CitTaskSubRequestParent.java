/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskSubRequestParent.java
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
 * Abstract base class for all CitTask related UdtSubRequestParents
 *
 */
public abstract class CitTaskSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitTaskRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitTaskSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitTaskSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitTaskSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitTaskSubRequestParent(String id, String method) {
    super(id, "CitTask", method);
  }
}
