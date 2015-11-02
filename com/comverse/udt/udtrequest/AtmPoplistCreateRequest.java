/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistCreateRequest.java
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
 * Class used to create a AtmPoplistCreateRequest Udt Request
 *
 */

public class AtmPoplistCreateRequest extends AtmPoplistSubRequestParent {
/**
 *
 * Constructor to create a  AtmPoplistCreateRequest
 * @param id Unique request name
 * @param atmCrIn AtmPoplistObjectData for AtmPoplistCreateRequest
 *
 */
@JsonCreator
  public AtmPoplistCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AtmPoplist")AtmPoplistObjectData atmCrIn) {
    super(id, "AtmPoplistCreate");
    if (atmCrIn != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmCrIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }

/**
 *
 * Retrieves the AtmPoplistObjectData that results from the AtmPoplistCreateRequest call
 * @return AtmPoplistObjectData resulting from udt call
 *
 */

  public AtmPoplistObjectData getOutput() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
}
