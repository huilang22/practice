/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileGetRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcFeedFileGetRequest Udt Request
 *
 */

public class CtcFeedFileGetRequest extends CtcFeedFileSubRequestParent {
/**
 *
 * Constructor to create a  CtcFeedFileGetRequest
 * @param id Unique request name
 * @param GetIn CtcFeedFileObjectKeyData for CtcFeedFileGetRequest
 *
 */
@JsonCreator
  public CtcFeedFileGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFeedFile")CtcFeedFileObjectKeyData GetIn) {
    super(id, "CtcFeedFileGet");
    if (GetIn != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcFeedFileObjectKeyData").get("CtcFeedFileObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFeedFileObjectData that results from the CtcFeedFileGetRequest call
 * @return CtcFeedFileObjectData resulting from udt call
 *
 */

  public CtcFeedFileObjectData getOutput() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
