/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtmTableGetRequest Udt Request
 *
 */

public class CtmTableGetRequest extends CtmTableSubRequestParent {
/**
 *
 * Constructor to create a  CtmTableGetRequest
 * @param id Unique request name
 * @param CtmTableGetIn CtmTableObjectKeyData for CtmTableGetRequest
 *
 */
@JsonCreator
  public CtmTableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmTable")CtmTableObjectKeyData CtmTableGetIn) {
    super(id, "CtmTableGet");
    if (CtmTableGetIn != null) {
      addInput("CtmTable", CtmTableObjectKeyHelper.toMap(CtmTableGetIn, new HashMap(), "CtmTableObjectKeyData").get("CtmTableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtmTableObjectData that results from the CtmTableGetRequest call
 * @return CtmTableObjectData resulting from udt call
 *
 */

  public CtmTableObjectData getOutput() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
}
