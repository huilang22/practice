/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTypeParameterSubRequestParent.java
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
 * Abstract base class for all BatchTypeParameter related UdtSubRequestParents
 *
 */
public abstract class BatchTypeParameterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchTypeParameterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeParameterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchTypeParameterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchTypeParameterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchTypeParameterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchTypeParameterSubRequestParent(String id, String method) {
    super(id, "BatchTypeParameter", method);
  }
}
