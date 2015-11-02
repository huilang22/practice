/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorGetRequest.java
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
 * Class used to create a GuiIndicatorGetRequest Udt Request
 *
 */

public class GuiIndicatorGetRequest extends GuiIndicatorSubRequestParent {
/**
 *
 * Constructor to create a  GuiIndicatorGetRequest
 * @param id Unique request name
 * @param GIGetIn GuiIndicatorObjectKeyData for GuiIndicatorGetRequest
 *
 */
@JsonCreator
  public GuiIndicatorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiIndicator")GuiIndicatorObjectKeyData GIGetIn) {
    super(id, "GuiIndicatorGet");
    if (GIGetIn != null) {
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(GIGetIn, new HashMap(), "GuiIndicatorObjectKeyData").get("GuiIndicatorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GuiIndicatorObjectData that results from the GuiIndicatorGetRequest call
 * @return GuiIndicatorObjectData resulting from udt call
 *
 */

  public GuiIndicatorObjectData getOutput() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
