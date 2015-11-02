/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianSubRequestParent.java
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
 * Abstract base class for all Technician related UdtSubRequestParents
 *
 */
public abstract class TechnicianSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TechnicianRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TechnicianRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TechnicianSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TechnicianSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TechnicianSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TechnicianSubRequestParent(String id, String method) {
    super(id, "Technician", method);
  }
}
