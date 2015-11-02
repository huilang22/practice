/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategorySubRequestParent.java
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
 * Abstract base class for all ServerCategory related UdtSubRequestParents
 *
 */
public abstract class ServerCategorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServerCategoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerCategoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServerCategorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServerCategorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServerCategorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServerCategorySubRequestParent(String id, String method) {
    super(id, "ServerCategory", method);
  }
}
