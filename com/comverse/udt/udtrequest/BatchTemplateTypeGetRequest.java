/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchTemplateTypeGetRequest.java
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
 * Class used to create a BatchTemplateTypeGetRequest Udt Request
 *
 */

public class BatchTemplateTypeGetRequest extends BatchTemplateTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchTemplateTypeGetRequest
 * @param id Unique request name
 * @param batchTemplateTypeGetIn BatchTemplateTypeObjectKeyData for BatchTemplateTypeGetRequest
 *
 */
@JsonCreator
  public BatchTemplateTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchTemplateType")BatchTemplateTypeObjectKeyData batchTemplateTypeGetIn) {
    super(id, "BatchTemplateTypeGet");
    if (batchTemplateTypeGetIn != null) {
      addInput("BatchTemplateType", BatchTemplateTypeObjectKeyHelper.toMap(batchTemplateTypeGetIn, new HashMap(), "BatchTemplateTypeObjectKeyData").get("BatchTemplateTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchTemplateTypeObjectData that results from the BatchTemplateTypeGetRequest call
 * @return BatchTemplateTypeObjectData resulting from udt call
 *
 */

  public BatchTemplateTypeObjectData getOutput() {
    return BatchTemplateTypeObjectHelper.fromMap(outputMap, "BatchTemplateType");
  }
}
