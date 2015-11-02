/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeFindRequest.java
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
 * Class used to create a ClassOfServiceCodeFindRequest Udt Request
 *
 */

public class ClassOfServiceCodeFindRequest extends ClassOfServiceCodeRequest {
/**
 *
 * Constructor to create a  ClassOfServiceCodeFindRequest
 * @param id Unique request name
 * @param COSCFindIn COSCObjectFilter for ClassOfServiceCodeFindRequest
 *
 */
@JsonCreator
  public ClassOfServiceCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClassOfServiceCode")COSCObjectFilter COSCFindIn) {
    super(id, "ClassOfServiceCodeFind");
    if (COSCFindIn != null) {
      Integer index =  COSCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(COSCFindIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }

/**
 *
 * Retrieves the COSCObjectDataList that results from the ClassOfServiceCodeFindRequest call
 * @return COSCObjectDataList resulting from udt call
 *
 */

  public COSCObjectDataList getOutput() {
    return COSCObjectHelper.fromMapList(outputMap, "ClassOfServiceCodeList");
  }
}
