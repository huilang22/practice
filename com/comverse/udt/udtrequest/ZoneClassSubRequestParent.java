/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneClassSubRequestParent.java
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
 * Abstract base class for all ZoneClass related UdtSubRequestParents
 *
 */
public abstract class ZoneClassSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ZoneClassRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ZoneClassRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ZoneClassSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ZoneClassSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ZoneClassSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ZoneClassSubRequestParent(String id, String method) {
    super(id, "ZoneClass", method);
  }
}
