/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceSubRequestParent.java
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
 * Abstract base class for all ProjectInstance related UdtSubRequestParents
 *
 */
public abstract class ProjectInstanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ProjectInstanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProjectInstanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ProjectInstanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ProjectInstanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ProjectInstanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ProjectInstanceSubRequestParent(String id, String method) {
    super(id, "ProjectInstance", method);
  }
}
