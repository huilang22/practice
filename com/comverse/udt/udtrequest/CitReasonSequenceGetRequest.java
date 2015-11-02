/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonSequenceGetRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitReasonSequenceGetRequest Udt Request
 *
 */

public class CitReasonSequenceGetRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a  CitReasonSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitReasonSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitReasonSequenceGet");
  }

/**
 *
 * Retrieves the CitReasonObjectKeyData that results from the CitReasonSequenceGetRequest call
 * @return CitReasonObjectKeyData resulting from udt call
 *
 */

  public CitReasonObjectKeyData getOutput() {
    return CitReasonObjectKeyHelper.fromMap(outputMap, "CitReason");
  }
}
