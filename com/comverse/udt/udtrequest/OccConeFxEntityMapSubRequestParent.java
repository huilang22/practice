/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapSubRequestParent.java
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
 * Abstract base class for all OccConeFxEntityMap related UdtSubRequestParents
 *
 */
public abstract class OccConeFxEntityMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on OccConeFxEntityMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OccConeFxEntityMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on OccConeFxEntityMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(OccConeFxEntityMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for OccConeFxEntityMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public OccConeFxEntityMapSubRequestParent(String id, String method) {
    super(id, "OccConeFxEntityMap", method);
  }
}
