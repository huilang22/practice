/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionBaseFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsEquipmentActionBaseFindRequest Udt Request
 *
 */

public class InvsEquipmentActionBaseFindRequest extends InvsEquipmentActionRequest {
/**
 *
 * Constructor to create a  InvsEquipmentActionBaseFindRequest
 * @param id Unique request name
 * @param InvsEquipmentActionBaseFindIn InvsEquipmentActionBaseObjectFilter for InvsEquipmentActionBaseFindRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionBaseFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionBaseObjectFilter InvsEquipmentActionBaseFindIn) {
    super(id, "InvsEquipmentActionBaseFind");
    if (InvsEquipmentActionBaseFindIn != null) {
      Integer index =  InvsEquipmentActionBaseFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentAction", InvsEquipmentActionBaseObjectHelper.toMap(InvsEquipmentActionBaseFindIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionBaseObjectDataList that results from the InvsEquipmentActionBaseFindRequest call
 * @return InvsEquipmentActionBaseObjectDataList resulting from udt call
 *
 */

  public InvsEquipmentActionBaseObjectDataList getOutput() {
    return InvsEquipmentActionBaseObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
}
