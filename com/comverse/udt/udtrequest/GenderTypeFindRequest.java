/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeFindRequest.java
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
 * Class used to create a GenderTypeFindRequest Udt Request
 *
 */

public class GenderTypeFindRequest extends GenderTypeRequest {
/**
 *
 * Constructor to create a  GenderTypeFindRequest
 * @param id Unique request name
 * @param GFindIn GenderTypeObjectFilter for GenderTypeFindRequest
 *
 */
@JsonCreator
  public GenderTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenderType")GenderTypeObjectFilter GFindIn) {
    super(id, "GenderTypeFind");
    if (GFindIn != null) {
      Integer index =  GFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GenderType", GenderTypeObjectHelper.toMap(GFindIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }

/**
 *
 * Retrieves the GenderTypeObjectDataList that results from the GenderTypeFindRequest call
 * @return GenderTypeObjectDataList resulting from udt call
 *
 */

  public GenderTypeObjectDataList getOutput() {
    return GenderTypeObjectHelper.fromMapList(outputMap, "GenderTypeList");
  }
}
