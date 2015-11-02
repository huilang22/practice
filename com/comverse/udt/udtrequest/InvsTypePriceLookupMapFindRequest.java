/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypePriceLookupMapFindRequest.java
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
 * Class used to create a InvsTypePriceLookupMapFindRequest Udt Request
 *
 */

public class InvsTypePriceLookupMapFindRequest extends InvsTypePriceLookupMapRequest {
/**
 *
 * Constructor to create a  InvsTypePriceLookupMapFindRequest
 * @param id Unique request name
 * @param ITPLMFindIn InvsTypePriceLookupMapObjectFilter for InvsTypePriceLookupMapFindRequest
 *
 */
@JsonCreator
  public InvsTypePriceLookupMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsTypePriceLookupMap")InvsTypePriceLookupMapObjectFilter ITPLMFindIn) {
    super(id, "InvsTypePriceLookupMapFind");
    if (ITPLMFindIn != null) {
      Integer index =  ITPLMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsTypePriceLookupMap", InvsTypePriceLookupMapObjectHelper.toMap(ITPLMFindIn, new HashMap(), "InvsTypePriceLookupMap").get("InvsTypePriceLookupMap"));
    }
  }

/**
 *
 * Retrieves the InvsTypePriceLookupMapObjectDataList that results from the InvsTypePriceLookupMapFindRequest call
 * @return InvsTypePriceLookupMapObjectDataList resulting from udt call
 *
 */

  public InvsTypePriceLookupMapObjectDataList getOutput() {
    return InvsTypePriceLookupMapObjectHelper.fromMapList(outputMap, "InvsTypePriceLookupMapList");
  }
}
