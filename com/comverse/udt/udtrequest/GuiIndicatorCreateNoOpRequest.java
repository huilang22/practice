/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorCreateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GuiIndicatorCreateNoOpRequest Udt Request/Response
 *
 */
public class GuiIndicatorCreateNoOpRequest extends GuiIndicatorSubRequestParent {
/**
 *
 * Constructor to create a   GuiIndicatorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GuiIndicatorCreateNoOpRequest(String id, GuiIndicatorObjectData noOpIn) {
    super(id, "GuiIndicatorCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(noOpIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
/**
 *
 * Retrieves the GuiIndicatorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GuiIndicatorObjectData getOutput() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
