/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeFindRequest.java
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
 * Class used to create a TransSourceTypeFindRequest Udt Request
 *
 */

public class TransSourceTypeFindRequest extends TransSourceTypeRequest {
/**
 *
 * Constructor to create a  TransSourceTypeFindRequest
 * @param id Unique request name
 * @param TSFindIn TransSourceTypeObjectFilter for TransSourceTypeFindRequest
 *
 */
@JsonCreator
  public TransSourceTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("TransSourceType")TransSourceTypeObjectFilter TSFindIn) {
    super(id, "TransSourceTypeFind");
    if (TSFindIn != null) {
      Integer index =  TSFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(TSFindIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }

/**
 *
 * Retrieves the TransSourceTypeObjectDataList that results from the TransSourceTypeFindRequest call
 * @return TransSourceTypeObjectDataList resulting from udt call
 *
 */

  public TransSourceTypeObjectDataList getOutput() {
    return TransSourceTypeObjectHelper.fromMapList(outputMap, "TransSourceTypeList");
  }
}
