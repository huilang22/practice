/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorDeleteRequest.java
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
 * Class used to create a GuiIndicatorDeleteRequest Udt Request
 *
 */

public class GuiIndicatorDeleteRequest extends GuiIndicatorSubRequestParent {
/**
 *
 * Constructor to create a  GuiIndicatorDeleteRequest
 * @param id Unique request name
 * @param GIDeleteIn GuiIndicatorObjectKeyData for GuiIndicatorDeleteRequest
 *
 */
@JsonCreator
  public GuiIndicatorDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiIndicator")GuiIndicatorObjectKeyData GIDeleteIn) {
    super(id, "GuiIndicatorDelete");
    if (GIDeleteIn != null) {
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(GIDeleteIn, new HashMap(), "GuiIndicatorObjectKeyData").get("GuiIndicatorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GuiIndicatorObjectData that results from the GuiIndicatorDeleteRequest call
 * @return GuiIndicatorObjectData resulting from udt call
 *
 */

  public GuiIndicatorObjectData getOutput() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
