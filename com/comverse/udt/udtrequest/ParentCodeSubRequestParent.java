/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeSubRequestParent.java
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
 * Abstract base class for all ParentCode related UdtSubRequestParents
 *
 */
public abstract class ParentCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ParentCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ParentCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ParentCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ParentCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ParentCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ParentCodeSubRequestParent(String id, String method) {
    super(id, "ParentCode", method);
  }
}
