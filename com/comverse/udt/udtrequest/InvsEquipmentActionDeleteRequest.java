/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionDeleteRequest.java
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
 * Class used to create a InvsEquipmentActionDeleteRequest Udt Request
 *
 */

public class InvsEquipmentActionDeleteRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentActionDeleteRequest
 * @param id Unique request name
 * @param InvsEquipmentActionDeleteIn InvsEquipmentActionObjectData for InvsEquipmentActionDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionObjectData InvsEquipmentActionDeleteIn) {
    super(id, "InvsEquipmentActionDelete");
    if (InvsEquipmentActionDeleteIn != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectHelper.toMap(InvsEquipmentActionDeleteIn, new HashMap(), "InvsEquipmentAction").get("InvsEquipmentAction"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionObjectData that results from the InvsEquipmentActionDeleteRequest call
 * @return InvsEquipmentActionObjectData resulting from udt call
 *
 */

  public InvsEquipmentActionObjectData getOutput() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
