/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesFindRequest.java
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
 * Class used to create a CcViewAttributesFindRequest Udt Request
 *
 */

public class CcViewAttributesFindRequest extends CcViewAttributesRequest {
/**
 *
 * Constructor to create a  CcViewAttributesFindRequest
 * @param id Unique request name
 * @param CVAfind_In CcViewAttributesObjectFilter for CcViewAttributesFindRequest
 *
 */
@JsonCreator
  public CcViewAttributesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewAttributes")CcViewAttributesObjectFilter CVAfind_In) {
    super(id, "CcViewAttributesFind");
    if (CVAfind_In != null) {
      Integer index =  CVAfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(CVAfind_In, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }

/**
 *
 * Retrieves the CcViewAttributesObjectDataList that results from the CcViewAttributesFindRequest call
 * @return CcViewAttributesObjectDataList resulting from udt call
 *
 */

  public CcViewAttributesObjectDataList getOutput() {
    return CcViewAttributesObjectHelper.fromMapList(outputMap, "CcViewAttributesList");
  }
}
