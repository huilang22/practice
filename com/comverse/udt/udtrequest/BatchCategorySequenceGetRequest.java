/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchCategorySequenceGetRequest.java
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
 * Class used to create a BatchCategorySequenceGetRequest Udt Request
 *
 */

public class BatchCategorySequenceGetRequest extends BatchCategorySubRequestParent {
/**
 *
 * Constructor to create a  BatchCategorySequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchCategorySequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchCategorySequenceGet");
  }

/**
 *
 * Retrieves the BatchCategoryObjectKeyData that results from the BatchCategorySequenceGetRequest call
 * @return BatchCategoryObjectKeyData resulting from udt call
 *
 */

  public BatchCategoryObjectKeyData getOutput() {
    return BatchCategoryObjectKeyHelper.fromMap(outputMap, "BatchCategory");
  }
}
