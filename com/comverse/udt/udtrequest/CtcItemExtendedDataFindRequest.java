/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataFindRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcItemExtendedDataFindRequest Udt Request
 *
 */

public class CtcItemExtendedDataFindRequest extends CtcItemExtendedDataRequest {
/**
 *
 * Constructor to create a  CtcItemExtendedDataFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemExtendedDataObjectFilter for CtcItemExtendedDataFindRequest
 *
 */
@JsonCreator
  public CtcItemExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemExtendedData")CtcItemExtendedDataObjectFilter FindIn) {
    super(id, "CtcItemExtendedDataFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(FindIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcItemExtendedDataObjectDataList that results from the CtcItemExtendedDataFindRequest call
 * @return CtcItemExtendedDataObjectDataList resulting from udt call
 *
 */

  public CtcItemExtendedDataObjectDataList getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMapList(outputMap, "CtcItemExtendedDataList");
  }
}
