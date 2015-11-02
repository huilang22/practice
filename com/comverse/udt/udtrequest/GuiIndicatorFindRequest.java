/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiIndicatorFindRequest.java
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
 * Class used to create a GuiIndicatorFindRequest Udt Request
 *
 */

public class GuiIndicatorFindRequest extends GuiIndicatorRequest {
/**
 *
 * Constructor to create a  GuiIndicatorFindRequest
 * @param id Unique request name
 * @param GIFindIn GuiIndicatorObjectFilter for GuiIndicatorFindRequest
 *
 */
@JsonCreator
  public GuiIndicatorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiIndicator")GuiIndicatorObjectFilter GIFindIn) {
    super(id, "GuiIndicatorFind");
    if (GIFindIn != null) {
      Integer index =  GIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(GIFindIn, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }

/**
 *
 * Retrieves the GuiIndicatorObjectDataList that results from the GuiIndicatorFindRequest call
 * @return GuiIndicatorObjectDataList resulting from udt call
 *
 */

  public GuiIndicatorObjectDataList getOutput() {
    return GuiIndicatorObjectHelper.fromMapList(outputMap, "GuiIndicatorList");
  }
}
