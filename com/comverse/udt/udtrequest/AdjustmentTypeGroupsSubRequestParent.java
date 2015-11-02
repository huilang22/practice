/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeGroupsSubRequestParent.java
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
 * Abstract base class for all AdjustmentTypeGroups related UdtSubRequestParents
 *
 */
public abstract class AdjustmentTypeGroupsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AdjustmentTypeGroupsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTypeGroupsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AdjustmentTypeGroupsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AdjustmentTypeGroupsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AdjustmentTypeGroupsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AdjustmentTypeGroupsSubRequestParent(String id, String method) {
    super(id, "AdjustmentTypeGroups", method);
  }
}
