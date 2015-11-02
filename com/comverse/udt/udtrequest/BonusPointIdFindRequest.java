/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdFindRequest.java
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
 * Class used to create a BonusPointIdFindRequest Udt Request
 *
 */

public class BonusPointIdFindRequest extends BonusPointIdRequest {
/**
 *
 * Constructor to create a  BonusPointIdFindRequest
 * @param id Unique request name
 * @param BPIFindIn BPIObjectFilter for BonusPointIdFindRequest
 *
 */
@JsonCreator
  public BonusPointIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointId")BPIObjectFilter BPIFindIn) {
    super(id, "BonusPointIdFind");
    if (BPIFindIn != null) {
      Integer index =  BPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointId", BPIObjectHelper.toMap(BPIFindIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }

/**
 *
 * Retrieves the BPIObjectDataList that results from the BonusPointIdFindRequest call
 * @return BPIObjectDataList resulting from udt call
 *
 */

  public BPIObjectDataList getOutput() {
    return BPIObjectHelper.fromMapList(outputMap, "BonusPointIdList");
  }
}
