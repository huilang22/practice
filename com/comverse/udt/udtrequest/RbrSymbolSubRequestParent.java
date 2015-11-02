/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolSubRequestParent.java
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
 * Abstract base class for all RbrSymbol related UdtSubRequestParents
 *
 */
public abstract class RbrSymbolSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrSymbolRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrSymbolRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrSymbolSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrSymbolSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrSymbolSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrSymbolSubRequestParent(String id, String method) {
    super(id, "RbrSymbol", method);
  }
}
