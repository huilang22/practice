/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefFindRequest.java
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
 * Class used to create a CcViewDefFindRequest Udt Request
 *
 */

public class CcViewDefFindRequest extends CcViewDefRequest {
/**
 *
 * Constructor to create a  CcViewDefFindRequest
 * @param id Unique request name
 * @param CVDfind_In CcViewDefObjectFilter for CcViewDefFindRequest
 *
 */
@JsonCreator
  public CcViewDefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcViewDef")CcViewDefObjectFilter CVDfind_In) {
    super(id, "CcViewDefFind");
    if (CVDfind_In != null) {
      Integer index =  CVDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(CVDfind_In, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }

/**
 *
 * Retrieves the CcViewDefObjectDataList that results from the CcViewDefFindRequest call
 * @return CcViewDefObjectDataList resulting from udt call
 *
 */

  public CcViewDefObjectDataList getOutput() {
    return CcViewDefObjectHelper.fromMapList(outputMap, "CcViewDefList");
  }
}
