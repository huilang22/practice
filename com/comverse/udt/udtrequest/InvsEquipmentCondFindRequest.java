/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondFindRequest.java
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
 * Class used to create a InvsEquipmentCondFindRequest Udt Request
 *
 */

public class InvsEquipmentCondFindRequest extends InvsEquipmentCondRequest {
/**
 *
 * Constructor to create a  InvsEquipmentCondFindRequest
 * @param id Unique request name
 * @param IECFindIn InvsEquipmentCondObjectFilter for InvsEquipmentCondFindRequest
 *
 */
@JsonCreator
  public InvsEquipmentCondFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentCond")InvsEquipmentCondObjectFilter IECFindIn) {
    super(id, "InvsEquipmentCondFind");
    if (IECFindIn != null) {
      Integer index =  IECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectHelper.toMap(IECFindIn, new HashMap(), "InvsEquipmentCond").get("InvsEquipmentCond"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentCondObjectDataList that results from the InvsEquipmentCondFindRequest call
 * @return InvsEquipmentCondObjectDataList resulting from udt call
 *
 */

  public InvsEquipmentCondObjectDataList getOutput() {
    return InvsEquipmentCondObjectHelper.fromMapList(outputMap, "InvsEquipmentCondList");
  }
}
