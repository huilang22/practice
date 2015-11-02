/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeSubRequestParent.java
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
 * Abstract base class for all GenderType related UdtSubRequestParents
 *
 */
public abstract class GenderTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GenderTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GenderTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GenderTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GenderTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GenderTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GenderTypeSubRequestParent(String id, String method) {
    super(id, "GenderType", method);
  }
}
