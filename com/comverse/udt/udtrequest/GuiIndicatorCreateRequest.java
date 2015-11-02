/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorCreateRequest.java
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
 * Class used to create a GuiIndicatorCreateRequest Udt Request
 *
 */

public class GuiIndicatorCreateRequest extends GuiIndicatorSubRequestParent {
/**
 *
 * Constructor to create a  GuiIndicatorCreateRequest
 * @param id Unique request name
 * @param GICreateIn GuiIndicatorObjectData for GuiIndicatorCreateRequest
 *
 */
@JsonCreator
  public GuiIndicatorCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiIndicator")GuiIndicatorObjectData GICreateIn) {
    super(id, "GuiIndicatorCreate");
    if (GICreateIn != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GICreateIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }

/**
 *
 * Retrieves the GuiIndicatorObjectData that results from the GuiIndicatorCreateRequest call
 * @return GuiIndicatorObjectData resulting from udt call
 *
 */

  public GuiIndicatorObjectData getOutput() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
