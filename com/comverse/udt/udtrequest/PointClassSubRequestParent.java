/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassSubRequestParent.java
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
 * Abstract base class for all PointClass related UdtSubRequestParents
 *
 */
public abstract class PointClassSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PointClassRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointClassRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PointClassSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointClassSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PointClassSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PointClassSubRequestParent(String id, String method) {
    super(id, "PointClass", method);
  }
}
