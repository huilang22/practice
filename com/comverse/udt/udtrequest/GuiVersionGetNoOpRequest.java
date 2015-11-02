/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionGetNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a GuiVersionGetNoOpRequest Udt Request/Response
 *
 */
public class GuiVersionGetNoOpRequest extends GuiVersionSubRequestParent {
/**
 *
 * Constructor to create a   GuiVersionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GuiVersionGetNoOpRequest(String id, GuiVersionObjectData noOpIn) {
    super(id, "GuiVersionGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(noOpIn, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }
/**
 *
 * Retrieves the GuiVersionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GuiVersionObjectData getOutput() {
    return GuiVersionObjectHelper.fromMap(outputMap, "GuiVersion");
  }
}
