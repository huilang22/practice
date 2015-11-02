/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionSubRequestParent.java
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
 * Abstract base class for all GuiVersion related UdtSubRequestParents
 *
 */
public abstract class GuiVersionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on GuiVersionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GuiVersionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on GuiVersionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(GuiVersionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for GuiVersionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public GuiVersionSubRequestParent(String id, String method) {
    super(id, "GuiVersion", method);
  }
}
