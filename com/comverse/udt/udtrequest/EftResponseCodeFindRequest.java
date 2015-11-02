/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftResponseCodeFindRequest.java
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
 * Class used to create a EftResponseCodeFindRequest Udt Request
 *
 */

public class EftResponseCodeFindRequest extends EftResponseCodeRequest {
/**
 *
 * Constructor to create a  EftResponseCodeFindRequest
 * @param id Unique request name
 * @param ERCFindIn EftResponseCodeObjectFilter for EftResponseCodeFindRequest
 *
 */
@JsonCreator
  public EftResponseCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftResponseCode")EftResponseCodeObjectFilter ERCFindIn) {
    super(id, "EftResponseCodeFind");
    if (ERCFindIn != null) {
      Integer index =  ERCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EftResponseCode", EftResponseCodeObjectHelper.toMap(ERCFindIn, new HashMap(), "EftResponseCode").get("EftResponseCode"));
    }
  }

/**
 *
 * Retrieves the EftResponseCodeObjectDataList that results from the EftResponseCodeFindRequest call
 * @return EftResponseCodeObjectDataList resulting from udt call
 *
 */

  public EftResponseCodeObjectDataList getOutput() {
    return EftResponseCodeObjectHelper.fromMapList(outputMap, "EftResponseCodeList");
  }
}
