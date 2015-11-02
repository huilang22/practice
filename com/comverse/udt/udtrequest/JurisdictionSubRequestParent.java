/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionSubRequestParent.java
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
 * Abstract base class for all Jurisdiction related UdtSubRequestParents
 *
 */
public abstract class JurisdictionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on JurisdictionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JurisdictionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on JurisdictionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JurisdictionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for JurisdictionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public JurisdictionSubRequestParent(String id, String method) {
    super(id, "Jurisdiction", method);
  }
}
