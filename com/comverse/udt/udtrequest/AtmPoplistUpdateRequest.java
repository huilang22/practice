/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AtmPoplistUpdateRequest.java
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
 * Class used to create a AtmPoplistUpdateRequest Udt Request
 *
 */

public class AtmPoplistUpdateRequest extends AtmPoplistSubRequestParent {
/**
 *
 * Constructor to create a  AtmPoplistUpdateRequest
 * @param id Unique request name
 * @param atmUpdIn AtmPoplistObjectData for AtmPoplistUpdateRequest
 *
 */
@JsonCreator
  public AtmPoplistUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AtmPoplist")AtmPoplistObjectData atmUpdIn) {
    super(id, "AtmPoplistUpdate");
    if (atmUpdIn != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(atmUpdIn, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }

/**
 *
 * Retrieves the AtmPoplistObjectData that results from the AtmPoplistUpdateRequest call
 * @return AtmPoplistObjectData resulting from udt call
 *
 */

  public AtmPoplistObjectData getOutput() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
}
