/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationFindRequest.java
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
 * Class used to create a ExtendedDataEnumerationFindRequest Udt Request
 *
 */

public class ExtendedDataEnumerationFindRequest extends ExtendedDataEnumerationRequest {
/**
 *
 * Constructor to create a  ExtendedDataEnumerationFindRequest
 * @param id Unique request name
 * @param EDFindIn EDObjectFilter for ExtendedDataEnumerationFindRequest
 *
 */
@JsonCreator
  public ExtendedDataEnumerationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataEnumeration")EDObjectFilter EDFindIn) {
    super(id, "ExtendedDataEnumerationFind");
    if (EDFindIn != null) {
      Integer index =  EDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDFindIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }

/**
 *
 * Retrieves the EDObjectDataList that results from the ExtendedDataEnumerationFindRequest call
 * @return EDObjectDataList resulting from udt call
 *
 */

  public EDObjectDataList getOutput() {
    return EDObjectHelper.fromMapList(outputMap, "ExtendedDataEnumerationList");
  }
}
