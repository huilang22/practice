/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportSequenceGetRequest.java
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
 * Class used to create a BatchReportSequenceGetRequest Udt Request
 *
 */

public class BatchReportSequenceGetRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BatchReportSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BatchReportSequenceGet");
  }

/**
 *
 * Retrieves the BatchReportObjectKeyData that results from the BatchReportSequenceGetRequest call
 * @return BatchReportObjectKeyData resulting from udt call
 *
 */

  public BatchReportObjectKeyData getOutput() {
    return BatchReportObjectKeyHelper.fromMap(outputMap, "BatchReport");
  }
}
