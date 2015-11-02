/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GuiVersionGetRequest Udt Request
 *
 */

public class GuiVersionGetRequest extends GuiVersionSubRequestParent {
/**
 *
 * Constructor to create a  GuiVersionGetRequest
 * @param id Unique request name
 * @param GVget_In GuiVersionObjectKeyData for GuiVersionGetRequest
 *
 */
@JsonCreator
  public GuiVersionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiVersion")GuiVersionObjectKeyData GVget_In) {
    super(id, "GuiVersionGet");
    if (GVget_In != null) {
      addInput("GuiVersion", GuiVersionObjectKeyHelper.toMap(GVget_In, new HashMap(), "GuiVersionObjectKeyData").get("GuiVersionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GuiVersionObjectData that results from the GuiVersionGetRequest call
 * @return GuiVersionObjectData resulting from udt call
 *
 */

  public GuiVersionObjectData getOutput() {
    return GuiVersionObjectHelper.fromMap(outputMap, "GuiVersion");
  }
}
