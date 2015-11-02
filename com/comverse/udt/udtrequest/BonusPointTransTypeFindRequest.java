/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeFindRequest.java
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
 * Class used to create a BonusPointTransTypeFindRequest Udt Request
 *
 */

public class BonusPointTransTypeFindRequest extends BonusPointTransTypeRequest {
/**
 *
 * Constructor to create a  BonusPointTransTypeFindRequest
 * @param id Unique request name
 * @param BPTTFindIn BonusPointTransTypeObjectFilter for BonusPointTransTypeFindRequest
 *
 */
@JsonCreator
  public BonusPointTransTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointTransType")BonusPointTransTypeObjectFilter BPTTFindIn) {
    super(id, "BonusPointTransTypeFind");
    if (BPTTFindIn != null) {
      Integer index =  BPTTFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTFindIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }

/**
 *
 * Retrieves the BonusPointTransTypeObjectDataList that results from the BonusPointTransTypeFindRequest call
 * @return BonusPointTransTypeObjectDataList resulting from udt call
 *
 */

  public BonusPointTransTypeObjectDataList getOutput() {
    return BonusPointTransTypeObjectHelper.fromMapList(outputMap, "BonusPointTransTypeList");
  }
}
