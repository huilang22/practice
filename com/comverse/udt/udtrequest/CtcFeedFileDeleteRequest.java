/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFeedFileDeleteRequest.java
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
 * Class used to create a CtcFeedFileDeleteRequest Udt Request
 *
 */

public class CtcFeedFileDeleteRequest extends CtcFeedFileSubRequestParent {
/**
 *
 * Constructor to create a  CtcFeedFileDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcFeedFileObjectKeyData for CtcFeedFileDeleteRequest
 *
 */
@JsonCreator
  public CtcFeedFileDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcFeedFile")CtcFeedFileObjectKeyData DeleteIn) {
    super(id, "CtcFeedFileDelete");
    if (DeleteIn != null) {
      addInput("CtcFeedFile", CtcFeedFileObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcFeedFileObjectKeyData").get("CtcFeedFileObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcFeedFileObjectData that results from the CtcFeedFileDeleteRequest call
 * @return CtcFeedFileObjectData resulting from udt call
 *
 */

  public CtcFeedFileObjectData getOutput() {
    return CtcFeedFileObjectHelper.fromMap(outputMap, "CtcFeedFile");
  }
}
