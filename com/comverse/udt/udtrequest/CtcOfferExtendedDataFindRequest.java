/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataFindRequest.java
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
 * Class used to create a CtcOfferExtendedDataFindRequest Udt Request
 *
 */

public class CtcOfferExtendedDataFindRequest extends CtcOfferExtendedDataRequest {
/**
 *
 * Constructor to create a  CtcOfferExtendedDataFindRequest
 * @param id Unique request name
 * @param FindIn CtcOfferExtendedDataObjectFilter for CtcOfferExtendedDataFindRequest
 *
 */
@JsonCreator
  public CtcOfferExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferExtendedData")CtcOfferExtendedDataObjectFilter FindIn) {
    super(id, "CtcOfferExtendedDataFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(FindIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferExtendedDataObjectDataList that results from the CtcOfferExtendedDataFindRequest call
 * @return CtcOfferExtendedDataObjectDataList resulting from udt call
 *
 */

  public CtcOfferExtendedDataObjectDataList getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMapList(outputMap, "CtcOfferExtendedDataList");
  }
}
