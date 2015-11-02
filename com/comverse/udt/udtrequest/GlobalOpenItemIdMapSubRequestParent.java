/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalOpenItemIdMapSubRequestParent.java
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
 * Abstract base class for all GlobalOpenItemIdMap related UdtSubRequestParents
 *
 */
public abstract class GlobalOpenItemIdMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GlobalOpenItemIdMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GlobalOpenItemIdMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GlobalOpenItemIdMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GlobalOpenItemIdMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GlobalOpenItemIdMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GlobalOpenItemIdMapSubRequestParent(String id, String method) {
    super(id, "GlobalOpenItemIdMap", method);
  }
}
