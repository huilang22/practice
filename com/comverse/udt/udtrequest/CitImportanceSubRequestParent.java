/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceSubRequestParent.java
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
 * Abstract base class for all CitImportance related UdtSubRequestParents
 *
 */
public abstract class CitImportanceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CitImportanceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitImportanceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CitImportanceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CitImportanceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CitImportanceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CitImportanceSubRequestParent(String id, String method) {
    super(id, "CitImportance", method);
  }
}
