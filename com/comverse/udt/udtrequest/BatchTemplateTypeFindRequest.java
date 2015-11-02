/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeFindRequest.java
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

import com.csgsystems.bat.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchTemplateTypeFindRequest Udt Request
 *
 */

public class BatchTemplateTypeFindRequest extends BatchTemplateTypeRequest {
/**
 *
 * Constructor to create a  BatchTemplateTypeFindRequest
 * @param id Unique request name
 * @param batchTemplateTypeFindIn BatchTemplateTypeObjectFilter for BatchTemplateTypeFindRequest
 *
 */
@JsonCreator
  public BatchTemplateTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTemplateType")BatchTemplateTypeObjectFilter batchTemplateTypeFindIn) {
    super(id, "BatchTemplateTypeFind");
    if (batchTemplateTypeFindIn != null) {
      Integer index =  batchTemplateTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchTemplateType", BatchTemplateTypeObjectHelper.toMap(batchTemplateTypeFindIn, new HashMap(), "BatchTemplateType").get("BatchTemplateType"));
    }
  }

/**
 *
 * Retrieves the BatchTemplateTypeObjectDataList that results from the BatchTemplateTypeFindRequest call
 * @return BatchTemplateTypeObjectDataList resulting from udt call
 *
 */

  public BatchTemplateTypeObjectDataList getOutput() {
    return BatchTemplateTypeObjectHelper.fromMapList(outputMap, "BatchTemplateTypeList");
  }
}
