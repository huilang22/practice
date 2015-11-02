/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementExecuteActionRequest.java
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
 * Class used to create a InvElementExecuteActionRequest Udt Request
 *
 */

public class InvElementExecuteActionRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementExecuteActionRequest
 * @param id Unique request name
 * @param InvExeActIn InvElementObjData for InvElementExecuteActionRequest
 * @param EquipmentActionId Integer for InvElementExecuteActionRequest
 *
 */
@JsonCreator
  public InvElementExecuteActionRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvExeActIn, @JsonProperty("EquipmentActionId")Integer EquipmentActionId) {
    super(id, "InvElementExecuteAction");
    if (InvExeActIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvExeActIn, new HashMap(), "Void").get("Void"));
    }
    if (EquipmentActionId != null) {
      addInput("EquipmentActionId", EquipmentActionId);
    }
  }

}
