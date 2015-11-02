/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategorySubRequestParent.java
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
 * Abstract base class for all BatchCategory related UdtSubRequestParents
 *
 */
public abstract class BatchCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchCategorySubRequestParent(String id, String method) {
    super(id, "BatchCategory", method);
  }
}
