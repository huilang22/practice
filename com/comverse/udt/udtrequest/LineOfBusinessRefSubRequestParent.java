/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefSubRequestParent.java
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
 * Abstract base class for all LineOfBusinessRef related UdtSubRequestParents
 *
 */
public abstract class LineOfBusinessRefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LineOfBusinessRefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LineOfBusinessRefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LineOfBusinessRefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LineOfBusinessRefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LineOfBusinessRefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LineOfBusinessRefSubRequestParent(String id, String method) {
    super(id, "LineOfBusinessRef", method);
  }
}
