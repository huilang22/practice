/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ZoneSubRequestParent.java
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
 * Abstract base class for all Zone related UdtSubRequestParents
 *
 */
public abstract class ZoneSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ZoneRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ZoneRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ZoneSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ZoneSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ZoneSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ZoneSubRequestParent(String id, String method) {
    super(id, "Zone", method);
  }
}
