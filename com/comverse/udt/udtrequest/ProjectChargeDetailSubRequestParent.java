/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailSubRequestParent.java
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
 * Abstract base class for all ProjectChargeDetail related UdtSubRequestParents
 *
 */
public abstract class ProjectChargeDetailSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProjectChargeDetailRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProjectChargeDetailRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProjectChargeDetailSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProjectChargeDetailSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProjectChargeDetailSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProjectChargeDetailSubRequestParent(String id, String method) {
    super(id, "ProjectChargeDetail", method);
  }
}
