/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionSequenceGetRequest.java
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
 * Class used to create a CitInteractionSequenceGetRequest Udt Request
 *
 */

public class CitInteractionSequenceGetRequest extends CitInteractionSubRequestParent {
/**
 *
 * Constructor to create a  CitInteractionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitInteractionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitInteractionSequenceGet");
  }

/**
 *
 * Retrieves the CitInteractionObjectKeyData that results from the CitInteractionSequenceGetRequest call
 * @return CitInteractionObjectKeyData resulting from udt call
 *
 */

  public CitInteractionObjectKeyData getOutput() {
    return CitInteractionObjectKeyHelper.fromMap(outputMap, "CitInteraction");
  }
}
