/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeFindRequest.java
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
 * Class used to create a EquipTypeCodeFindRequest Udt Request
 *
 */

public class EquipTypeCodeFindRequest extends EquipTypeCodeRequest {
/**
 *
 * Constructor to create a  EquipTypeCodeFindRequest
 * @param id Unique request name
 * @param ETGFindIn ETGObjectFilter for EquipTypeCodeFindRequest
 *
 */
@JsonCreator
  public EquipTypeCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipTypeCode")ETGObjectFilter ETGFindIn) {
    super(id, "EquipTypeCodeFind");
    if (ETGFindIn != null) {
      Integer index =  ETGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGFindIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }

/**
 *
 * Retrieves the ETGObjectDataList that results from the EquipTypeCodeFindRequest call
 * @return ETGObjectDataList resulting from udt call
 *
 */

  public ETGObjectDataList getOutput() {
    return ETGObjectHelper.fromMapList(outputMap, "EquipTypeCodeList");
  }
}
