/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeSubRequestParent.java
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
 * Abstract base class for all IndustryType related UdtSubRequestParents
 *
 */
public abstract class IndustryTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on IndustryTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(IndustryTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on IndustryTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(IndustryTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for IndustryTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public IndustryTypeSubRequestParent(String id, String method) {
    super(id, "IndustryType", method);
  }
}
