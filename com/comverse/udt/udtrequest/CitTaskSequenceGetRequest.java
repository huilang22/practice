/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskSequenceGetRequest.java
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
 * Class used to create a CitTaskSequenceGetRequest Udt Request
 *
 */

public class CitTaskSequenceGetRequest extends CitTaskSubRequestParent {
/**
 *
 * Constructor to create a  CitTaskSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public CitTaskSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "CitTaskSequenceGet");
  }

/**
 *
 * Retrieves the CitTaskObjectBaseKeyData that results from the CitTaskSequenceGetRequest call
 * @return CitTaskObjectBaseKeyData resulting from udt call
 *
 */

  public CitTaskObjectBaseKeyData getOutput() {
    return CitTaskObjectBaseKeyHelper.fromMap(outputMap, "CitTask");
  }
}
