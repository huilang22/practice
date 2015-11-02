/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GuiIndicator related UdtRequests
 *
 */

public abstract class GuiIndicatorRequest extends UdtRequest {

/**
 *
 * Constructor for GuiIndicatorRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GuiIndicatorRequest(String id, String method) {
    super(id, "GuiIndicator", method);
  }
}
