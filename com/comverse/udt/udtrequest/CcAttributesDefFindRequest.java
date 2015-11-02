/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefFindRequest.java
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
 * Class used to create a CcAttributesDefFindRequest Udt Request
 *
 */

public class CcAttributesDefFindRequest extends CcAttributesDefRequest {
/**
 *
 * Constructor to create a  CcAttributesDefFindRequest
 * @param id Unique request name
 * @param CADfind_In CcAttributesDefObjectFilter for CcAttributesDefFindRequest
 *
 */
@JsonCreator
  public CcAttributesDefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CcAttributesDef")CcAttributesDefObjectFilter CADfind_In) {
    super(id, "CcAttributesDefFind");
    if (CADfind_In != null) {
      Integer index =  CADfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(CADfind_In, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }

/**
 *
 * Retrieves the CcAttributesDefObjectDataList that results from the CcAttributesDefFindRequest call
 * @return CcAttributesDefObjectDataList resulting from udt call
 *
 */

  public CcAttributesDefObjectDataList getOutput() {
    return CcAttributesDefObjectHelper.fromMapList(outputMap, "CcAttributesDefList");
  }
}
