/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchExecutableEnvironmentalVariableSubRequestParent.java
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
 * Abstract base class for all BatchExecutableEnvironmentalVariable related UdtSubRequestParents
 *
 */
public abstract class BatchExecutableEnvironmentalVariableSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchExecutableEnvironmentalVariableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchExecutableEnvironmentalVariableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchExecutableEnvironmentalVariableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchExecutableEnvironmentalVariableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchExecutableEnvironmentalVariableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchExecutableEnvironmentalVariableSubRequestParent(String id, String method) {
    super(id, "BatchExecutableEnvironmentalVariable", method);
  }
}
