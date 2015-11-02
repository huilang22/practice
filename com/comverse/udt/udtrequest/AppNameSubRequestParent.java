/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AppNameSubRequestParent.java
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
 * Abstract base class for all AppName related UdtSubRequestParents
 *
 */
public abstract class AppNameSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on AppNameRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AppNameRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on AppNameSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(AppNameSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for AppNameSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public AppNameSubRequestParent(String id, String method) {
    super(id, "AppName", method);
  }
}
