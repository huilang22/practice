/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GuiVersionFindRequest.java
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
 * Class used to create a GuiVersionFindRequest Udt Request
 *
 */

public class GuiVersionFindRequest extends GuiVersionRequest {
/**
 *
 * Constructor to create a  GuiVersionFindRequest
 * @param id Unique request name
 * @param GVfind_In GuiVersionObjectFilter for GuiVersionFindRequest
 *
 */
@JsonCreator
  public GuiVersionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GuiVersion")GuiVersionObjectFilter GVfind_In) {
    super(id, "GuiVersionFind");
    if (GVfind_In != null) {
      Integer index =  GVfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(GVfind_In, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }

/**
 *
 * Retrieves the GuiVersionObjectDataList that results from the GuiVersionFindRequest call
 * @return GuiVersionObjectDataList resulting from udt call
 *
 */

  public GuiVersionObjectDataList getOutput() {
    return GuiVersionObjectHelper.fromMapList(outputMap, "GuiVersionList");
  }
}
