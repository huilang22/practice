/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GuiIndicatorUpdateRequest Udt Request
 *
 */

public class GuiIndicatorUpdateRequest extends GuiIndicatorSubRequestParent {
/**
 *
 * Constructor to create a  GuiIndicatorUpdateRequest
 * @param id Unique request name
 * @param GIUpdateIn GuiIndicatorObjectData for GuiIndicatorUpdateRequest
 *
 */
@JsonCreator
  public GuiIndicatorUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiIndicator")GuiIndicatorObjectData GIUpdateIn) {
    super(id, "GuiIndicatorUpdate");
    if (GIUpdateIn != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GIUpdateIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }

/**
 *
 * Retrieves the GuiIndicatorObjectData that results from the GuiIndicatorUpdateRequest call
 * @return GuiIndicatorObjectData resulting from udt call
 *
 */

  public GuiIndicatorObjectData getOutput() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
