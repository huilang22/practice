/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqGroupsMapSubRequestParent.java
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
 * Abstract base class for all ExternalIdHqGroupsMap related UdtSubRequestParents
 *
 */
public abstract class ExternalIdHqGroupsMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExternalIdHqGroupsMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdHqGroupsMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExternalIdHqGroupsMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdHqGroupsMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExternalIdHqGroupsMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExternalIdHqGroupsMapSubRequestParent(String id, String method) {
    super(id, "ExternalIdHqGroupsMap", method);
  }
}
