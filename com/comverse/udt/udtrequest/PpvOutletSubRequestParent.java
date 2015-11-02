/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvOutletSubRequestParent.java
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
 * Abstract base class for all PpvOutlet related UdtSubRequestParents
 *
 */
public abstract class PpvOutletSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PpvOutletRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PpvOutletRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PpvOutletSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PpvOutletSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PpvOutletSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PpvOutletSubRequestParent(String id, String method) {
    super(id, "PpvOutlet", method);
  }
}
