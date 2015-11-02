/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskDeleteRequest.java
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
 * Class used to create a CitTaskDeleteRequest Udt Request
 *
 */

public class CitTaskDeleteRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskDeleteRequest
 * @param id Unique request name
 * @param citTaskDeleteIn CitTaskObjectBaseKeyData for CitTaskDeleteRequest
 *
 */
@JsonCreator
  public CitTaskDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTask")CitTaskObjectBaseKeyData citTaskDeleteIn) {
    super(id, "CitTaskDelete");
    if (citTaskDeleteIn != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(citTaskDeleteIn, new HashMap(), "CitTaskObjectBaseKeyData").get("CitTaskObjectBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CitTaskObjectBaseData that results from the CitTaskDeleteRequest call
 * @return CitTaskObjectBaseData resulting from udt call
 *
 */

  public CitTaskObjectBaseData getOutput() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
}
