/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistGetRequest.java
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
 * Class used to create a AtmPoplistGetRequest Udt Request
 *
 */

public class AtmPoplistGetRequest extends AtmPoplistSubRequestParent {
/**
 *
 * Constructor to create a  AtmPoplistGetRequest
 * @param id Unique request name
 * @param atmGetIn AtmPoplistObjectKeyData for AtmPoplistGetRequest
 *
 */
@JsonCreator
  public AtmPoplistGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AtmPoplist")AtmPoplistObjectKeyData atmGetIn) {
    super(id, "AtmPoplistGet");
    if (atmGetIn != null) {
      addInput("AtmPoplist", AtmPoplistObjectKeyHelper.toMap(atmGetIn, new HashMap(), "AtmPoplistObjectKeyData").get("AtmPoplistObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AtmPoplistObjectData that results from the AtmPoplistGetRequest call
 * @return AtmPoplistObjectData resulting from udt call
 *
 */

  public AtmPoplistObjectData getOutput() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
}
