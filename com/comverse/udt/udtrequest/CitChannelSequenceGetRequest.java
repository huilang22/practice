/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitChannelSequenceGetRequest.java
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
 * Class used to create a CitChannelSequenceGetRequest Udt Request
 *
 */

public class CitChannelSequenceGetRequest extends CitChannelSubRequestParent {
/**
 *
 * Constructor to create a  CitChannelSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitChannelSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitChannelSequenceGet");
  }

/**
 *
 * Retrieves the CitChannelObjectKeyData that results from the CitChannelSequenceGetRequest call
 * @return CitChannelObjectKeyData resulting from udt call
 *
 */

  public CitChannelObjectKeyData getOutput() {
    return CitChannelObjectKeyHelper.fromMap(outputMap, "CitChannel");
  }
}
