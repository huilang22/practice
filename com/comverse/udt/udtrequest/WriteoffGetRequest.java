/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a WriteoffGetRequest Udt Request
 *
 */

public class WriteoffGetRequest extends WriteoffSubRequestParent {
/**
 *
 * Constructor to create a  WriteoffGetRequest
 * @param id Unique request name
 * @param WRITEOFFgetIn WriteoffObjectKeyData for WriteoffGetRequest
 *
 */
@JsonCreator
  public WriteoffGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Writeoff")WriteoffObjectKeyData WRITEOFFgetIn) {
    super(id, "WriteoffGet");
    if (WRITEOFFgetIn != null) {
      addInput("Writeoff", WriteoffObjectKeyHelper.toMap(WRITEOFFgetIn, new HashMap(), "WriteoffObjectKeyData").get("WriteoffObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the WriteoffObjectData that results from the WriteoffGetRequest call
 * @return WriteoffObjectData resulting from udt call
 *
 */

  public WriteoffObjectData getOutput() {
    return WriteoffObjectHelper.fromMap(outputMap, "Writeoff");
  }
}
