/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeFindRequest.java
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
 * Class used to create a LanguageCodeFindRequest Udt Request
 *
 */

public class LanguageCodeFindRequest extends LanguageCodeRequest {
/**
 *
 * Constructor to create a  LanguageCodeFindRequest
 * @param id Unique request name
 * @param LCFindIn LCObjectFilter for LanguageCodeFindRequest
 *
 */
@JsonCreator
  public LanguageCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")LCObjectFilter LCFindIn) {
    super(id, "LanguageCodeFind");
    if (LCFindIn != null) {
      Integer index =  LCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LanguageCode", LCObjectHelper.toMap(LCFindIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }

/**
 *
 * Retrieves the LCObjectDataList that results from the LanguageCodeFindRequest call
 * @return LCObjectDataList resulting from udt call
 *
 */

  public LCObjectDataList getOutput() {
    return LCObjectHelper.fromMapList(outputMap, "LanguageCodeList");
  }
}
