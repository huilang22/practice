/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrCreateRequest.java
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
 * Class used to create a NrcTransDescrCreateRequest Udt Request
 *
 */

public class NrcTransDescrCreateRequest extends NrcTransDescrSubRequestParent {
/**
 *
 * Constructor to create a  NrcTransDescrCreateRequest
 * @param id Unique request name
 * @param nrcCrIn NrcTransDescrObjectData for NrcTransDescrCreateRequest
 *
 */
@JsonCreator
  public NrcTransDescrCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTransDescr")NrcTransDescrObjectData nrcCrIn) {
    super(id, "NrcTransDescrCreate");
    if (nrcCrIn != null) {
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrcCrIn, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
  }

/**
 *
 * Retrieves the NrcTransDescrObjectData that results from the NrcTransDescrCreateRequest call
 * @return NrcTransDescrObjectData resulting from udt call
 *
 */

  public NrcTransDescrObjectData getOutput() {
    return NrcTransDescrObjectHelper.fromMap(outputMap, "NrcTransDescr");
  }
}
