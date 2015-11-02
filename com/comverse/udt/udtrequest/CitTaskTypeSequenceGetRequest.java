/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeSequenceGetRequest.java
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
 * Class used to create a CitTaskTypeSequenceGetRequest Udt Request
 *
 */

public class CitTaskTypeSequenceGetRequest extends CitTaskTypeSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskTypeSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitTaskTypeSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitTaskTypeSequenceGet");
  }

/**
 *
 * Retrieves the CitTaskTypeObjectKeyData that results from the CitTaskTypeSequenceGetRequest call
 * @return CitTaskTypeObjectKeyData resulting from udt call
 *
 */

  public CitTaskTypeObjectKeyData getOutput() {
    return CitTaskTypeObjectKeyHelper.fromMap(outputMap, "CitTaskType");
  }
}
