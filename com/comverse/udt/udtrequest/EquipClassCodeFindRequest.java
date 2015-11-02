/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeFindRequest.java
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
 * Class used to create a EquipClassCodeFindRequest Udt Request
 *
 */

public class EquipClassCodeFindRequest extends EquipClassCodeRequest {
/**
 *
 * Constructor to create a  EquipClassCodeFindRequest
 * @param id Unique request name
 * @param ECCFindIn ECCObjectFilter for EquipClassCodeFindRequest
 *
 */
@JsonCreator
  public EquipClassCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipClassCode")ECCObjectFilter ECCFindIn) {
    super(id, "EquipClassCodeFind");
    if (ECCFindIn != null) {
      Integer index =  ECCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCFindIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }

/**
 *
 * Retrieves the ECCObjectDataList that results from the EquipClassCodeFindRequest call
 * @return ECCObjectDataList resulting from udt call
 *
 */

  public ECCObjectDataList getOutput() {
    return ECCObjectHelper.fromMapList(outputMap, "EquipClassCodeList");
  }
}
