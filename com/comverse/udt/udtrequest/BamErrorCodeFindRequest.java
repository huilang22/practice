/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeFindRequest.java
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
 * Class used to create a BamErrorCodeFindRequest Udt Request
 *
 */

public class BamErrorCodeFindRequest extends BamErrorCodeRequest {
/**
 *
 * Constructor to create a  BamErrorCodeFindRequest
 * @param id Unique request name
 * @param BECFindIn BECObjectFilter for BamErrorCodeFindRequest
 *
 */
@JsonCreator
  public BamErrorCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BamErrorCode")BECObjectFilter BECFindIn) {
    super(id, "BamErrorCodeFind");
    if (BECFindIn != null) {
      Integer index =  BECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BamErrorCode", BECObjectHelper.toMap(BECFindIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }

/**
 *
 * Retrieves the BECObjectDataList that results from the BamErrorCodeFindRequest call
 * @return BECObjectDataList resulting from udt call
 *
 */

  public BECObjectDataList getOutput() {
    return BECObjectHelper.fromMapList(outputMap, "BamErrorCodeList");
  }
}
