/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeSubRequestParent.java
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
 * Abstract base class for all LocationCode related UdtSubRequestParents
 *
 */
public abstract class LocationCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LocationCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LocationCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LocationCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LocationCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LocationCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LocationCodeSubRequestParent(String id, String method) {
    super(id, "LocationCode", method);
  }
}
