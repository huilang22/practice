/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeFindRequest.java
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
 * Class used to create a ParentCodeFindRequest Udt Request
 *
 */

public class ParentCodeFindRequest extends ParentCodeRequest {
/**
 *
 * Constructor to create a  ParentCodeFindRequest
 * @param id Unique request name
 * @param ParentCodeFindIn ParentCodeObjectFilter for ParentCodeFindRequest
 *
 */
@JsonCreator
  public ParentCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ParentCode")ParentCodeObjectFilter ParentCodeFindIn) {
    super(id, "ParentCodeFind");
    if (ParentCodeFindIn != null) {
      Integer index =  ParentCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeFindIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }

/**
 *
 * Retrieves the ParentCodeObjectDataList that results from the ParentCodeFindRequest call
 * @return ParentCodeObjectDataList resulting from udt call
 *
 */

  public ParentCodeObjectDataList getOutput() {
    return ParentCodeObjectHelper.fromMapList(outputMap, "ParentCodeList");
  }
}
