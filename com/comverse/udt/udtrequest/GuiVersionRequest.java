/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all GuiVersion related UdtRequests
 *
 */

public abstract class GuiVersionRequest extends UdtRequest {

/**
 *
 * Constructor for GuiVersionRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public GuiVersionRequest(String id, String method) {
    super(id, "GuiVersion", method);
  }
}
