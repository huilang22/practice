/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategorySubRequestParent.java
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
 * Abstract base class for all PointCategory related UdtSubRequestParents
 *
 */
public abstract class PointCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PointCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PointCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PointCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PointCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PointCategorySubRequestParent(String id, String method) {
    super(id, "PointCategory", method);
  }
}
