/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrUpdateRequest.java
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
 * Class used to create a NrcTransDescrUpdateRequest Udt Request
 *
 */

public class NrcTransDescrUpdateRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a  NrcTransDescrUpdateRequest
 * @param id Unique request name
 * @param nrcUpdIn NrcTransDescrObjectData for NrcTransDescrUpdateRequest
 *
 */
@JsonCreator
  public NrcTransDescrUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTransDescr")NrcTransDescrObjectData nrcUpdIn) {
    super(id, "NrcTransDescrUpdate");
    if (nrcUpdIn != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcUpdIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectData that results from the NrcTransDescrUpdateRequest call
 * @return NrcTransDescrObjectData resulting from udt call
 *
 */

  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
}
