/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeFindRequest.java
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
 * Class used to create a ExternalIdTypeFindRequest Udt Request
 *
 */

public class ExternalIdTypeFindRequest extends ExternalIdTypeRequest {
/**
 *
 * Constructor to create a  ExternalIdTypeFindRequest
 * @param id Unique request name
 * @param EITFindIn ExternalIdTypeObjectFilter for ExternalIdTypeFindRequest
 *
 */
@JsonCreator
  public ExternalIdTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdType")ExternalIdTypeObjectFilter EITFindIn) {
    super(id, "ExternalIdTypeFind");
    if (EITFindIn != null) {
      Integer index =  EITFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITFindIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }

/**
 *
 * Retrieves the ExternalIdTypeObjectDataList that results from the ExternalIdTypeFindRequest call
 * @return ExternalIdTypeObjectDataList resulting from udt call
 *
 */

  public ExternalIdTypeObjectDataList getOutput() {
    return ExternalIdTypeObjectHelper.fromMapList(outputMap, "ExternalIdTypeList");
  }
}
