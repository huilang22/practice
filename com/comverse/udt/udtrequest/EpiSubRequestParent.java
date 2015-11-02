/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiSubRequestParent.java
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
 * Abstract base class for all Epi related UdtSubRequestParents
 *
 */
public abstract class EpiSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EpiRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EpiRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EpiSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EpiSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EpiSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EpiSubRequestParent(String id, String method) {
    super(id, "Epi", method);
  }
}
