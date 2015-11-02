/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcGenreSubRequestParent.java
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
 * Abstract base class for all CtcGenre related UdtSubRequestParents
 *
 */
public abstract class CtcGenreSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcGenreRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcGenreRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcGenreSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcGenreSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcGenreSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcGenreSubRequestParent(String id, String method) {
    super(id, "CtcGenre", method);
  }
}
