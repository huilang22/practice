/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertSubRequestParent.java
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
 * Abstract base class for all UsageUnitsConvert related UdtSubRequestParents
 *
 */
public abstract class UsageUnitsConvertSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsageUnitsConvertRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageUnitsConvertRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsageUnitsConvertSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsageUnitsConvertSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsageUnitsConvertSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsageUnitsConvertSubRequestParent(String id, String method) {
    super(id, "UsageUnitsConvert", method);
  }
}
