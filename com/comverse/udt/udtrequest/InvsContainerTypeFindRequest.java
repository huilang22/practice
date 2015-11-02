/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsContainerTypeFindRequest Udt Request
 *
 */

public class InvsContainerTypeFindRequest extends InvsContainerTypeRequest {
/**
 *
 * Constructor to create a  InvsContainerTypeFindRequest
 * @param id Unique request name
 * @param InvsContainerTypeFindIn InvsContainerTypeObjectFilter for InvsContainerTypeFindRequest
 *
 */
@JsonCreator
  public InvsContainerTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerType")InvsContainerTypeObjectFilter InvsContainerTypeFindIn) {
    super(id, "InvsContainerTypeFind");
    if (InvsContainerTypeFindIn != null) {
      Integer index =  InvsContainerTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(InvsContainerTypeFindIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeObjectDataList that results from the InvsContainerTypeFindRequest call
 * @return InvsContainerTypeObjectDataList resulting from udt call
 *
 */

  public InvsContainerTypeObjectDataList getOutput() {
    return InvsContainerTypeObjectHelper.fromMapList(outputMap, "InvsContainerTypeList");
  }
}
