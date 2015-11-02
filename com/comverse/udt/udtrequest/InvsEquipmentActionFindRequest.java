/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionFindRequest.java
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
 * Class used to create a InvsEquipmentActionFindRequest Udt Request
 *
 */

public class InvsEquipmentActionFindRequest extends InvsEquipmentActionRequest {
/**
 *
 * Constructor to create a  InvsEquipmentActionFindRequest
 * @param id Unique request name
 * @param InvsEquipmentActionFindIn InvsEquipmentActionObjectFilter for InvsEquipmentActionFindRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionObjectFilter InvsEquipmentActionFindIn) {
    super(id, "InvsEquipmentActionFind");
    if (InvsEquipmentActionFindIn != null) {
      Integer index =  InvsEquipmentActionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionFindIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionObjectDataList that results from the InvsEquipmentActionFindRequest call
 * @return InvsEquipmentActionObjectDataList resulting from udt call
 *
 */

  public InvsEquipmentActionObjectDataList getOutput() {
    return InvsEquipmentActionObjectHelper.fromMapList(outputMap, "InvsEquipmentActionList");
  }
}
