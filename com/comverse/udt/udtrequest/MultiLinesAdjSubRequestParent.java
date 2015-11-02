/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjSubRequestParent.java
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
 * Abstract base class for all MultiLinesAdj related UdtSubRequestParents
 *
 */
public abstract class MultiLinesAdjSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on MultiLinesAdjRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MultiLinesAdjRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on MultiLinesAdjSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(MultiLinesAdjSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for MultiLinesAdjSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public MultiLinesAdjSubRequestParent(String id, String method) {
    super(id, "MultiLinesAdj", method);
  }
}
