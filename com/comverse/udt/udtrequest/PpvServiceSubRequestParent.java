/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvServiceSubRequestParent.java
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
 * Abstract base class for all PpvService related UdtSubRequestParents
 *
 */
public abstract class PpvServiceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PpvServiceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PpvServiceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PpvServiceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PpvServiceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PpvServiceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PpvServiceSubRequestParent(String id, String method) {
    super(id, "PpvService", method);
  }
}
