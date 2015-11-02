/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysSubRequestParent.java
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
 * Abstract base class for all NonWorkDays related UdtSubRequestParents
 *
 */
public abstract class NonWorkDaysSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on NonWorkDaysRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NonWorkDaysRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on NonWorkDaysSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(NonWorkDaysSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for NonWorkDaysSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public NonWorkDaysSubRequestParent(String id, String method) {
    super(id, "NonWorkDays", method);
  }
}
