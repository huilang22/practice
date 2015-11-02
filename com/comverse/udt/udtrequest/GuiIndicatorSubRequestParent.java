/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorSubRequestParent.java
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
 * Abstract base class for all GuiIndicator related UdtSubRequestParents
 *
 */
public abstract class GuiIndicatorSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GuiIndicatorRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GuiIndicatorRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GuiIndicatorSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GuiIndicatorSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GuiIndicatorSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GuiIndicatorSubRequestParent(String id, String method) {
    super(id, "GuiIndicator", method);
  }
}
