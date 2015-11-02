/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableSubRequestParent.java
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
 * Abstract base class for all CtmTable related UdtSubRequestParents
 *
 */
public abstract class CtmTableSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtmTableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmTableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtmTableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtmTableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtmTableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtmTableSubRequestParent(String id, String method) {
    super(id, "CtmTable", method);
  }
}
