/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneSubRequestParent.java
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
 * Abstract base class for all Timezone related UdtSubRequestParents
 *
 */
public abstract class TimezoneSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TimezoneRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TimezoneRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TimezoneSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TimezoneSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TimezoneSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TimezoneSubRequestParent(String id, String method) {
    super(id, "Timezone", method);
  }
}
