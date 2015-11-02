/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistSubRequestParent.java
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
 * Abstract base class for all AtmPoplist related UdtSubRequestParents
 *
 */
public abstract class AtmPoplistSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AtmPoplistRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AtmPoplistRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AtmPoplistSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AtmPoplistSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AtmPoplistSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AtmPoplistSubRequestParent(String id, String method) {
    super(id, "AtmPoplist", method);
  }
}
